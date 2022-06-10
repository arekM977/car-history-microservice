package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
    }

    public String hello() {
        return "To przyszlo z HelloService";
    }
}

