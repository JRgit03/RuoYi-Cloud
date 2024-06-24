package com.ruoyi.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@org.springframework.web.bind.annotation.RestController
public class TestController {
    @Value("${common.value}")
    private String commonValue;

    @GetMapping
    public String t1(){
        return commonValue;
    }
}
