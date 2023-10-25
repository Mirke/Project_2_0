package com.lad666.albummicroservice.Security.Services;

import com.lad666.albummicroservice.Security.Entities.User;
import com.lad666.albummicroservice.Security.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{
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
