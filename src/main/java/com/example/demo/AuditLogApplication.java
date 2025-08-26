package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient 
public class AuditLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditLogApplication.class, args);
	}

}
