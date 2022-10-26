package com.neon.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories("com.neon.repository")
@EntityScan("com.neon.entity")
@ComponentScan({"com.neon.*"})
@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication
public class CrsJavaProjectSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsJavaProjectSpringJpaApplication.class, args);
	}

}
