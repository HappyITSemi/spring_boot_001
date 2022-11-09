package com.example.spring_boot_001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/")
    public String BaseIndex(){
        return "OK";
    }

    @GetMapping(value="/hello")
    public String Hello(){
        return "Hello !";
    }
}
