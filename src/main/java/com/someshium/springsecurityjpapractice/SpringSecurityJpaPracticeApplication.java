package com.someshium.springsecurityjpapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses =  UserRepository.class)
public class SpringSecurityJpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaPracticeApplication.class, args);
	}

}









