package com.web.controller;

import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired private UserService userService;

  @PostMapping("/add")
  public String addUser(@RequestParam String name) {
    try {
      userService.addUser(name);
      return "Success!";
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "Failed!";
  }

  @GetMapping("/count")
  public Long getUserCount() {
    try {
      return userService.getTotalNuOfUsers();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return 0l;
  }
}
