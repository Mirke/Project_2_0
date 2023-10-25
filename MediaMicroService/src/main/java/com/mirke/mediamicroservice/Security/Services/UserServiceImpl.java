package com.mirke.mediamicroservice.Security.Services;

import com.mirke.mediamicroservice.Security.Entities.User;
import com.mirke.mediamicroservice.Security.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
