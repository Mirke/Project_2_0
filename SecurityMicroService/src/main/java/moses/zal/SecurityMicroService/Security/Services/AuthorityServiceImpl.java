package moses.zal.SecurityMicroService.Security.Services;

import moses.zal.SecurityMicroService.Security.Entities.Authority;
import moses.zal.SecurityMicroService.Security.Repositories.AuthorityRepository;
import moses.zal.SecurityMicroService.Security.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorityServiceImpl implements AuthorityService {
  private AuthorityRepository authorityRepository;
  private UserRepository userRepository;

  @Autowired
  public AuthorityServiceImpl(AuthorityRepository authorityRepository, UserRepository userRepository) {
    this.authorityRepository = authorityRepository;
    this.userRepository = userRepository;
  }

  @Override
  public List<Authority> getAllUsers() {
    return authorityRepository.findAll();
  }

  @Override
  @Transactional
  public ResponseEntity<String> userDeletionLogic(String username) {
    Authority authority = authorityRepository.findByUser_Username(username);
    if (authorityRepository.countAuthoritiesByAuthority("ROLE_ADMIN") == 1 && authority.getAuthority().equals("ROLE_ADMIN"))
      return ResponseEntity.badRequest().body("Process Failed!\nIt's not possible to delete the only admin in the system!!");
    else{
      authorityRepository.delete(authority);
      return new ResponseEntity<>("The user with the username \"" + username + "\" is deleted successfully!", HttpStatus.OK);
    }
  }

  @Override
  @Transactional
  public ResponseEntity<String> authorityAndUserUpdateLogic(Authority jsonAuthority, int role_ID) {
    Authority databaseAuthority = findByID(role_ID);
    if (databaseAuthority.getAuthority().equals("ROLE_ADMIN") && !jsonAuthority.getAuthority().equals("ROLE_ADMIN") &&
            authorityRepository.countAuthoritiesByAuthority("ROLE_ADMIN") == 1) {
      return ResponseEntity.badRequest().body("Process Failed!\nIt's not possible to change the only admin in the system" +
              " into a user!!");
    }
    else {
      databaseAuthority.setAuthority(jsonAuthority.getAuthority());
      databaseAuthority.getUser().setPassword(jsonAuthority.getUser().getPassword());
      databaseAuthority.getUser().setActive(jsonAuthority.getUser().isActive());
      authorityRepository.save(databaseAuthority);
      return new ResponseEntity<>("User updated successfully!", HttpStatus.OK);
    }
  }

  @Override
  public Authority findByID(int ID) {
    Authority authority = null;
    Optional <Authority> possibleAuthority = authorityRepository.findById(ID);
    if (possibleAuthority.isPresent())
      authority = possibleAuthority.get();
    return authority;
  }

  @Override
  @Transactional
  public ResponseEntity<String> authorityAndUserCreationLogic(Authority authorityAndUserBeingCreated) {
    authorityAndUserBeingCreated.setRole_ID(0);
    String username = authorityAndUserBeingCreated.getUser().getUsername();
    if (userRepository.existsUserByUsername(username))
      return ResponseEntity.badRequest().body("Process Failed!\nUsername already exists!!");
    else {
      authorityRepository.save(authorityAndUserBeingCreated);
      return new ResponseEntity<>("A new user with the username \"" + username + "\" is successfully created!", HttpStatus.OK);
    }
  }
}
