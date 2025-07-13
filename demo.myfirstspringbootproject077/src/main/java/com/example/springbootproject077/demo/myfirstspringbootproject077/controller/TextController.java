package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import com.example.springbootproject077.demo.myfirstspringbootproject077.components.TextComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
    private  final TextComponent textComponent;

    @Autowired
    public TextController (TextComponent textComponent){
        this.textComponent= textComponent;
    }

    @GetMapping("/reverse/{text}")
    public String reverseText (@PathVariable String text){
        return  textComponent.reverse(text);
    }
}
