package com.mirke.genremicroservice.Security.Services;

import com.mirke.genremicroservice.Security.Entities.User;

import java.util.List;

public interface UserService {
  List<User> getAllUsers();
}
