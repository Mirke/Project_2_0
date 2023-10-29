package moses.zal.SecurityMicroService.Controller;

import moses.zal.SecurityMicroService.Security.Entities.Authority;
import moses.zal.SecurityMicroService.Security.Entities.User;
import moses.zal.SecurityMicroService.Security.Services.AuthorityService;
import moses.zal.SecurityMicroService.Security.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/edufy/security")
public class AdminRestController {
  private AuthorityService authorityService;

  @Autowired
  public AdminRestController(AuthorityService authorityService) {
    this.authorityService = authorityService;
  }

  @GetMapping("/users")
  public List<Authority> getAllUsers () {
    return authorityService.getAllUsers();
  }

  @DeleteMapping("/users/{username}")
  public ResponseEntity <String> deleteUser (@PathVariable String username) {
    return authorityService.userDeletionLogic(username);
  }

  @PutMapping ("users&roles/{role_ID}")
  public ResponseEntity <String> updateUser (@RequestBody Authority authorityAndUserBeingEdited, @PathVariable int role_ID) {
    return authorityService.authorityAndUserUpdateLogic(authorityAndUserBeingEdited, role_ID);
  }

  @PostMapping ("/users/newuser")
  public ResponseEntity <String> createUser (@RequestBody Authority newUser) {
    return authorityService.authorityAndUserCreationLogic(newUser);
  }
}
