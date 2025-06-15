package com.peanut.controller;

import com.peanut.service.ResilienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ResilienceController {

    private final ResilienceService resilienceService;

    @GetMapping("/test")
    public String testResilience(@RequestParam(defaultValue = "test") String input) {
        return resilienceService.processRequest(input);
    }
} 