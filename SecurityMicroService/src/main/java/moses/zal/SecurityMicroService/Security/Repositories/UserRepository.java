package moses.zal.SecurityMicroService.Security.Repositories;


import moses.zal.SecurityMicroService.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  Boolean existsUserByUsername (String username);
}
