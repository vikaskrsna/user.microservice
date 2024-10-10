package com.microservice.user.service;

import com.microservice.user.entity.User;
import com.microservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User getUserById(Long userId){
        return  userRepository.findById(userId).get();
    }
}
