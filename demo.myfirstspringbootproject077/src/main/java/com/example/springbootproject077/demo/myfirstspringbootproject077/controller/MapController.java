package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class MapController {


    @GetMapping("/meta")
    public Map<String,Object>meta(){
        return Map.of(
                "status","active",
                "time" , LocalDateTime.now(),
                "userId",1234
        );
    }
}
