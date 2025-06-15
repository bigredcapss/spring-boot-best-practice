package com.peanut.guava.controller;

import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/guava")
public class GuavaDemoController {

    @Autowired
    private LoadingCache<String, String> guavaCache;

    @GetMapping("/cache/{key}")
    public String getFromCache(@PathVariable String key) {
        try {
            return guavaCache.get(key);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @PostMapping("/cache/{key}")
    public void putInCache(@PathVariable String key, @RequestBody String value) {
        guavaCache.put(key, value);
    }
} 