package com.arun.controller;

import com.arun.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping("/details/{id}")
  public User userdetails(@PathVariable String id) {

    return new User("Arun", 53);

  }

}
