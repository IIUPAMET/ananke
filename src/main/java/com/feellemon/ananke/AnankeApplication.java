package com.feellemon.ananke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@EnableJpaRepositories
@EnableWebMvc
@SpringBootApplication
public class AnankeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnankeApplication.class, args);
	}

}
