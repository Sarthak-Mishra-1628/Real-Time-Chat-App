package com.chat.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {
	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(AppApplication.class, args);
		System.out.println("Hi");
	}
}