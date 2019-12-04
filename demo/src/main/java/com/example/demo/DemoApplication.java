package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		show();
	}
	
	public static String show() {
		System.out.println("Welcome to Spring boots");
		return "Hello world";
	}

}


