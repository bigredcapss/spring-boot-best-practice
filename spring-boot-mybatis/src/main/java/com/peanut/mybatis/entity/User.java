package com.peanut.mybatis.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private Integer age;
} 