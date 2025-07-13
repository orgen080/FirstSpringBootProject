package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import com.example.springbootproject077.demo.myfirstspringbootproject077.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    //injektimi i greetingService nepermjet konstruktorit

    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService= greetingService;
    }
    @GetMapping("/greeting")
    public String getGreeting(){
        return greetingService.greet();

    }
}
