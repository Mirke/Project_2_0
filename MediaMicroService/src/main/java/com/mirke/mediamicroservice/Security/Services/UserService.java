package com.mirke.mediamicroservice.Security.Services;

import com.mirke.mediamicroservice.Security.Entities.User;

import java.util.List;

public interface UserService {
  List<User> getAllUsers();
}
