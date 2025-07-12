package com.example.springbootproject077.demo.myfirstspringbootproject077.components;


import org.springframework.stereotype.Component;
//kjo klase esht nje komponent qe dueht ta menaxhoj vete
//ddhe ta krijosh automatikisht kur nis aplikacionin
//nuk kemi nevoje te krijojme vete objektin me new
//spring krijon nje objekt nga kjo klase
//ky objekt ruhet ne kontekstin e springut ne nje memorje te perbashket
//mund ta perdorim kete objekt kudo tjeter ne aplikacion me
//anotatyion @Autowired
@Component
public class MessageComponents {

    public  String getMessage(){
        return "Hello world!";
    }

}
