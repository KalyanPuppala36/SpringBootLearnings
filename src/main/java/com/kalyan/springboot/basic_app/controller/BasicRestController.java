package com.kalyan.springboot.basic_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
