package com.example.springbootproject077.demo.myfirstspringbootproject077.service;

import org.springframework.stereotype.Service;

//tregon qe kjo klase esht nje sherbim lloghik
//dhe ka buisnes logic te aplikacioni
@Service
public class GreetingService {

    public String greet(){
        return "Hello from Greeting Service";
    }
}
