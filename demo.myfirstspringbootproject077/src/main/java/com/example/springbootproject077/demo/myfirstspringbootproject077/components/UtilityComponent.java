package com.example.springbootproject077.demo.myfirstspringbootproject077.components;

import org.springframework.stereotype.Component;

@Component
public class UtilityComponent {
    public String toUpper(String text){
        return  text.toUpperCase();
    }
}
