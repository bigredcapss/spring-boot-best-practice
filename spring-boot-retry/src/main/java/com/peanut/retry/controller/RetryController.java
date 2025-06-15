package com.peanut.retry.controller;

import com.peanut.retry.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/retry")
public class RetryController {

    @Autowired
    private RetryService retryService;

    @GetMapping("/test")
    public String testRetry() {
        return retryService.retryMethod();
    }
} 