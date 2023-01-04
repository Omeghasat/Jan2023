package com.example.Jan2023.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Stating that this is a controller
@RequestMapping("/hello") //name of the controller
public class HelloController {
    @GetMapping("/greet")
    public String sayHello(){
        return "Welcome to the Springboot Framework";
    }
}
