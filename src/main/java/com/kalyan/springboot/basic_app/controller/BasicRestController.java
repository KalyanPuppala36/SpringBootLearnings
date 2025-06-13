package com.kalyan.springboot.basic_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/github")
    public String getAuthorGithub() {
        return "<a href='https://github.com/KalyanPuppala36'>MyGithub</a>";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Hello all;";
    }
}
