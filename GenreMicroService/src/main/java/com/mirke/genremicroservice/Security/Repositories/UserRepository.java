package com.mirke.genremicroservice.Security.Repositories;

import com.mirke.genremicroservice.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findByUsername (String username);
}
