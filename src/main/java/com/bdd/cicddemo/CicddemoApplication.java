package com.bdd.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CicddemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		System.out.println("Main method called..... ");

		SpringApplication.run(CicddemoApplication.class, args);
	}

}
