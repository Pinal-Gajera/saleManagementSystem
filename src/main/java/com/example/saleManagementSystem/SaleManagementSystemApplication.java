package com.example.saleManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SaleManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleManagementSystemApplication.class, args);

	}

}
