package com.example.springbootproject077.demo.myfirstspringbootproject077.components;

import org.springframework.stereotype.Component;

@Component
public class TextComponent {
    public String reverse (String input){
        return new StringBuilder(input).reverse().toString();
    }
}
