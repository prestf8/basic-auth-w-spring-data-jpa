package com.example.topaz.intellijprogressivewebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class IntellijProgressiveWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntellijProgressiveWebApplication.class, args);
	}

}
