package com.example.podcastcreatormicroservice.Security.Services;

import com.example.podcastcreatormicroservice.Security.Entities.User;

import java.util.List;

public interface UserService {
  List<User> getAllUsers();
}
