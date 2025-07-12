package com.example.springbootproject077.demo.myfirstspringbootproject077;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//eshte  annotation me i rendesishem ne nje projekt Springboot
//vendoset zakonisht ne klasen kryesore te aplikacionit
//dhe kombinon 3 annotations te tjera te Springut
//@springBootApplication =@Configuration+@EnableAutoConfiguration+Componentscanm
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
