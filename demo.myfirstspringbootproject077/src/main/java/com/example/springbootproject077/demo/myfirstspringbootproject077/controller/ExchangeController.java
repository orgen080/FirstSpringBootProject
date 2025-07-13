package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ExchangeController {
    private static  final double EXCHANGE_RATE =1.1;

    @GetMapping("eur-to-usd/{amount}")

    public String convertEurToUsd(@PathVariable double amount){
        double result =amount*EXCHANGE_RATE;
        return amount + "EUR=" +String.format("%.2f" , result)+ "USD";
        //per te formatuar nje numer me dy shifra pas presjes

    }


}
