package com.Sportyshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages=  ("com.Sportyshoes.Controller"))
@ComponentScan(basePackages=  ("com.Sportyshoes.Service"))


public class SportyShoes {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoes.class, args);
		System.out.println("Server Started....");
	}

}
