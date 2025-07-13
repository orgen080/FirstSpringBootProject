package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;

import com.example.springbootproject077.demo.myfirstspringbootproject077.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @GetMapping("/people")
    public List<Person>getPeople(){
        return  List.of(
                new Person("ANA" ,20) ,
                new Person("TOM" ,23)
        );
    }
}
