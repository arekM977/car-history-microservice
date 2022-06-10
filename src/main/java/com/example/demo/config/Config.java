package com.example.demo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration


public class Config {


    @Autowired
    private ObjectMapper objectMapper;

    public Config() {
    }

    void customizeObjectMapper() {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

}