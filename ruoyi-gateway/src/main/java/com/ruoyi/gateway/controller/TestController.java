package com.ruoyi.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${common.value}")
    private String commonValue;

    @GetMapping
    public String t1(){
        return commonValue;
    }

    public static void main(String[] args) {
        String password = "QDANgaG6MtE1ncdN";
        System.out.println(new BCryptPasswordEncoder().encode(password));
        // $2a$10$cuiglQ6teeIALazBrrjQbOAbNRDp.OLa/SDs9lxY.0yvpFFqrRJT.

        // $2a$10$J18TBRpTM2iCuDnM564Bw.CkAR4WOvSiB8HkMH/eXm/4mIoPeljT6
    }
}