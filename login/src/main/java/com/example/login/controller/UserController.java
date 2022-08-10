package com.example.login.controller;

import com.example.login.dto.UserDto;
import com.example.login.request.LoginRequest;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping ("/login")
    public UserDto loginUser(@RequestBody LoginRequest request){
        return userService.loginUser(request);
    }

}
