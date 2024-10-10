package com.microservice.user.controller;


import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService ;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }
}
