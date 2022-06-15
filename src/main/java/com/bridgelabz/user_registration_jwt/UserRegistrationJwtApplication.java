package com.bridgelabz.user_registration_jwt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@Slf4j
public class UserRegistrationJwtApplication {

	public static void main(String[] args) {
		System.out.println("Welcome To User Registration JWT Application");

		log.info("Welcome to User Registration App");
		ApplicationContext context = SpringApplication.run(UserRegistrationJwtApplication.class, args);
		log.info("User Registration Started in {} Environment",
				context.getEnvironment().getProperty("environment"));
		log.info("User Registration DB User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));

	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
