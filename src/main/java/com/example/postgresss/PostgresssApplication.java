package com.example.postgresss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PostgresssApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresssApplication.class, args);
	}

}
