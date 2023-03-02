package com.suhkanth.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LoginApplication {

	@GetMapping
	public String message(){
		return "Hello world this sukhanth";
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
