package com.microservice.user.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentId;

}
