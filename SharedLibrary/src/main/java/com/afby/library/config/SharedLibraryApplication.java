package com.afby.library.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.afby.library")
@SpringBootApplication
public class SharedLibraryApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SharedLibraryApplication.class, args);
	}
}
