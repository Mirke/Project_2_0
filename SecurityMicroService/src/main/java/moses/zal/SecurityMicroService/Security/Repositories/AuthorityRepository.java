package moses.zal.SecurityMicroService.Security.Repositories;


import moses.zal.SecurityMicroService.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
  Authority findByUser_Username (String username);
  Integer countAuthoritiesByAuthority (String authority);
}
