package com.example.podcastcreatormicroservice.Security.Repositories;

import com.example.podcastcreatormicroservice.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findByUsername (String username);
}
