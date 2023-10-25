package com.mirke.ratingsystem.Security.Repositories;

import com.mirke.ratingsystem.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findByUsername (String username);
}
