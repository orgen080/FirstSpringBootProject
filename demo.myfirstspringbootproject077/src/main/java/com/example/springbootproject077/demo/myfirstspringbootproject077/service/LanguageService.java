package com.example.springbootproject077.demo.myfirstspringbootproject077.service;

import org.springframework.stereotype.Service;

@Service
public class LanguageService {
    public String findLanguage(String language){
        switch(language.toLowerCase()){
            case "en":
            return "Hello";
            case "fr":
            return "Bonjur";
            case"de":
            return "Halo";
            default :
            return "Hello rast default" ;
        }
    }
}
