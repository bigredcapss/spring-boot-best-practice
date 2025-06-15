package com.peanut.mapstruct.controller;

import com.peanut.mapstruct.dto.UserDTO;
import com.peanut.mapstruct.entity.User;
import com.peanut.mapstruct.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/convert")
    public UserDTO convertToDTO(@RequestBody User user) {
        return userMapper.toDTO(user);
    }

    @PostMapping("/convert-back")
    public User convertToEntity(@RequestBody UserDTO userDTO) {
        return userMapper.toEntity(userDTO);
    }
} 