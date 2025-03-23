package com.enesbayram.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.enesbayram.configuration.GlobalProperties;

@SpringBootApplication
@EntityScan(basePackages = {"com.enesbayram"})
@ComponentScan(basePackages = {"com.enesbayram"})
@EnableJpaRepositories(basePackages = {"com.enesbayram"})
@EnableConfigurationProperties(value = GlobalProperties.class)
public class SpringDataJpaApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
