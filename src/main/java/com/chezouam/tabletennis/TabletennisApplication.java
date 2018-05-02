package com.chezouam.tabletennis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.chezouam.tabletennis.repository")
public class TabletennisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TabletennisApplication.class, args);
	}
}
