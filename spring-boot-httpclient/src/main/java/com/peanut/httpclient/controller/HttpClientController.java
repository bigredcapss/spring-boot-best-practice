package com.peanut.httpclient.controller;

import com.peanut.httpclient.service.HttpClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/http-client")
@RequiredArgsConstructor
public class HttpClientController {

    private final HttpClientService httpClientService;

    @GetMapping("/test-get")
    public String testGet(@RequestParam String url) throws Exception {
        return httpClientService.doGet(url);
    }

    @PostMapping("/test-post")
    public String testPost(@RequestParam String url, @RequestBody String jsonBody) throws Exception {
        return httpClientService.doPost(url, jsonBody);
    }
} 