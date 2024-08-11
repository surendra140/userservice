package com.codespace.userservice.controller;

import com.codespace.userservice.model.User;
import com.codespace.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user-register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
