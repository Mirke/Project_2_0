package com.lad666.albummicroservice.Security.Services;

import com.lad666.albummicroservice.Security.Entities.User;

import java.util.List;

public interface UserService {
  List<User> getAllUsers();
}
