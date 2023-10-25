package com.mirke.mediamicroservice.Security.Repositories;

import com.mirke.mediamicroservice.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findByUsername (String username);
}
