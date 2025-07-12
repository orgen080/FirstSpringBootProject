package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//klasa sherben si api ne web
// kthen pergjigje direkt si tekst ap si json
@RestController
public class MyController {

    //lidh metoden java me url e caktuar
    @GetMapping("/hello")
    public String satHello(){
        return"Hellooo";
    }

}
