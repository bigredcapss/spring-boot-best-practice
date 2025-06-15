package com.peanut.mapstruct.mapper;

import com.peanut.mapstruct.dto.UserDTO;
import com.peanut.mapstruct.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "password", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    UserDTO toDTO(User user);

    @Mapping(target = "password", source = "password")
    @Mapping(target = "updateTime", expression = "java(java.time.LocalDateTime.now())")
    User toEntity(UserDTO userDTO);
} 