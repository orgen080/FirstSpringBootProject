package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {
    @GetMapping("/names")
    public List<String> names(){
        return List.of("Beni" , "Ana");
    }
}
