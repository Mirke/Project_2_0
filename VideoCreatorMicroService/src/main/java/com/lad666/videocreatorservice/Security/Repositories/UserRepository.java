package com.lad666.videocreatorservice.Security.Repositories;


import com.lad666.videocreatorservice.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findByUsername (String username);
}
