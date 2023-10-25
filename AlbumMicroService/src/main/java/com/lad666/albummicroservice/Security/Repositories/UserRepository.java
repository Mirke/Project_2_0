package com.lad666.albummicroservice.Security.Repositories;

import com.lad666.albummicroservice.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findByUsername (String username);
}
