package com.example.tdd.tdddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@EnableTransactionManagement
public class TdddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdddemoApplication.class, args);
	}

}
