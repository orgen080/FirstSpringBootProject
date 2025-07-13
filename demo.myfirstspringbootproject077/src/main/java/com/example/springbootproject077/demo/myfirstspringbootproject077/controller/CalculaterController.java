package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import com.example.springbootproject077.demo.myfirstspringbootproject077.components.CalculatorComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculaterController {

    private final CalculatorComponent calculatorComponent;

    @Autowired
    public CalculaterController(CalculatorComponent calculatorComponent) {
        this.calculatorComponent = calculatorComponent;
    }
//
//    @GetMapping("/add")
//    public String add(@PathVariable int a ,@PathVariable)
//

    @GetMapping("/add")
    public String add(@RequestParam int a , @RequestParam int b){
        int result= calculatorComponent.add(a ,b);
                return "Rezultati:"+ result;
    }



}
