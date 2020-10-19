package com.jedrzejewski.Luhn.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jedrzejewski.Luhn.algorithm"})
public class LuhnAlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuhnAlgorithmApplication.class, args);
	}

}
