package com.peanut.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class ResilienceService {

    private final Random random = new Random();

    @CircuitBreaker(name = "backendA", fallbackMethod = "circuitBreakerFallback")
    @Retry(name = "backendA", fallbackMethod = "retryFallback")
    @RateLimiter(name = "backendA")
    public String processRequest(String input) {
        // 模拟随机失败
        if (random.nextBoolean()) {
            throw new RuntimeException("随机失败");
        }
        return "处理成功: " + input;
    }

    public String circuitBreakerFallback(String input, Exception e) {
        log.error("断路器触发，输入: {}, 异常: {}", input, e.getMessage());
        return "断路器降级处理: " + input;
    }

    public String retryFallback(String input, Exception e) {
        log.error("重试失败，输入: {}, 异常: {}", input, e.getMessage());
        return "重试降级处理: " + input;
    }
} 