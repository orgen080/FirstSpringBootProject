package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import com.example.springbootproject077.demo.myfirstspringbootproject077.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    private final CounterService counterService;


    @Autowired
    public CounterController(CounterService counterService){
        this.counterService = counterService;

    }


    @GetMapping("/count")
    public String count (){
       int current = counterService.incrementAndRefresh();
        return "Vlera aktuale eshte:" + current;
    }
}
