package moses.zal.SecurityMicroService.Security.Services;

import moses.zal.SecurityMicroService.Security.Entities.Authority;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AuthorityService {
  List<Authority> getAllUsers();
  ResponseEntity <String> userDeletionLogic (String username);
  ResponseEntity <String> authorityAndUserUpdateLogic (Authority authorityAndUserBeingEdited, int role_ID);
  Authority findByID (int ID);
  ResponseEntity <String> authorityAndUserCreationLogic (Authority authorityAndUserBeingCreated);
}
