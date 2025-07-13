package com.example.springbootproject077.demo.myfirstspringbootproject077.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int counter = 0;
    public int incrementAndRefresh(){
        counter++;
        return counter;
    }

}
