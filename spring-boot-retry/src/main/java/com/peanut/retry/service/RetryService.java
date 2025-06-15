package com.peanut.retry.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryService {

    private int attempt = 0;

    @Retryable(
        value = {RuntimeException.class},
        maxAttempts = 3,
        backoff = @Backoff(delay = 1000)
    )
    public String retryMethod() {
        attempt++;
        if (attempt < 3) {
            throw new RuntimeException("模拟失败，这是第 " + attempt + " 次尝试");
        }
        return "成功！这是第 " + attempt + " 次尝试";
    }

    @Recover
    public String recover(RuntimeException e) {
        return "所有重试都失败了，这是恢复方法";
    }
} 