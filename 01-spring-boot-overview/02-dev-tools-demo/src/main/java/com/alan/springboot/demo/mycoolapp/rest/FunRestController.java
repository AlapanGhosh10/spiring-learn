package com.alan.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }
    @GetMapping("/workout")
    public String getWorkout() {
        return "Who's gonna carry the boats and the logs";
    }
    @GetMapping("/hope")
    public String getHope() {
        return "I don't have that hope shit";
    }
}
