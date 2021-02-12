package com.web.service;

import com.web.entity.User;
import com.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

  @Autowired private UserRepository userRepository;

  public Integer addUser(String name) {
    return userRepository.save(new User(name)).getId();
  }

  public Long getTotalNuOfUsers() {
    return userRepository.count();
  }
}
