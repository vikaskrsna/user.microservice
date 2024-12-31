package com.microservice.user.controller;


import com.microservice.user.VO.ResponseTemplateVO;
import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService ;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("User controller to save user data");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO  getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("User controller to getUserWithDepartment");
        return userService.getUserWithDepartment(userId);
    }
}
