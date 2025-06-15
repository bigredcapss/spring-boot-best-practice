package com.peanut.mybatis.mapper;

import com.peanut.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    
    @Select("SELECT * FROM user")
    List<User> findAll();
    
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(Long id);
} 