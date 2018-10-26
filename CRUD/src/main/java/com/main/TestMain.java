package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages="com.model")
@SpringBootApplication(scanBasePackages="com")
@EnableJpaRepositories(basePackages="com.DaoInterface")

public class TestMain {
vbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("change");
		SpringApplication.run(TestMain.class, args);
		System.out.println("Started");
	}
}


