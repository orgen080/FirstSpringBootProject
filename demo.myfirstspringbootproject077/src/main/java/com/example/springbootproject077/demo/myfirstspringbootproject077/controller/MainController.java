package com.example.springbootproject077.demo.myfirstspringbootproject077.controller;


import com.example.springbootproject077.demo.myfirstspringbootproject077.components.MessageComponents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



//ku anotation tregon qe kjo klase eshte nje controlloer
//pra pergjigjet ndaj kerkesave HTTP
//kjo klasw komunikon me webin
//e ben klasen te pergatise pergjigjet direkt si tekst
//kur dikush shkon tek localhost:8080/mesazh
//do te merrte kerkesen dhe do te kethente pergjigje


@RestController
public class MainController {


    //tregon qe springu duhet te injektoje automatikisht
    //nje objekt tipit MessageComponent
    //pra pa perdorur keywordin new
    @Autowired
    private MessageComponents messageComponents;

    @GetMapping("/mesazh")
    public String shfaqMesazhin(){
        return  messageComponents.getMessage();
            }
}
