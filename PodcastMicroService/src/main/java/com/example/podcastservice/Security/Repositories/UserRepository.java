package com.example.podcastservice.Security.Repositories;


import com.example.podcastservice.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findByUsername (String username);
}
