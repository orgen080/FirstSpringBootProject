package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

;
import com.example.springbootproject077.demo.myfirstspringbootproject077.components.UtilityComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilityController {

    private final UtilityComponent utilityComponent;

    public UtilityController(UtilityComponent utilityComponent){
        this.utilityComponent = utilityComponent;
    }

    @GetMapping("/upper/{text}")
    public  String upper(@PathVariable String text){
        return utilityComponent.toUpper(text);
    }
}