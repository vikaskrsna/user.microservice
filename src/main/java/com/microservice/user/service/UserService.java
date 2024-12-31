package com.microservice.user.service;

import com.microservice.user.VO.Department;
import com.microservice.user.VO.ResponseTemplateVO;
import com.microservice.user.entity.User;
import com.microservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findById(userId).isPresent() ? userRepository.findById(userId).get() : null;
        vo.setUser(user);
        if(user != null){
            Department department = restTemplate.getForObject("http://localhost:9001/department/" + user.getDepartmentId(), Department.class);
            vo.setDepartment(department);
        }
        return vo;
    }

}
