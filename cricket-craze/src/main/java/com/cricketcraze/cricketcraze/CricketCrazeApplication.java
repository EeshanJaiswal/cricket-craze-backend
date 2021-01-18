package com.cricketcraze.cricketcraze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@EntityScan(
	basePackages = {
		"com.cricketcraze.player.model"
	}
)

@EnableJpaRepositories(
	basePackages = {
		"com.cricketcraze.player.repository"
	}
)

@SpringBootApplication
public class CricketCrazeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketCrazeApplication.class, args);
	}

}
