package com.peanut.caffeine.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    
    private final Map<String, String> userMap = new HashMap<>();
    
    public UserService() {
        // 初始化一些测试数据
        userMap.put("1", "张三");
        userMap.put("2", "李四");
        userMap.put("3", "王五");
    }
    
    @Cacheable(value = "userCache", key = "#id")
    public String getUserName(String id) {
        System.out.println("从数据库获取用户信息: " + id);
        return userMap.get(id);
    }
} 