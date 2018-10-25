package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages="com")
public class TestMain {

	public static void main(String[] args) {
		System.out.println("main");
		SpringApplication.run(TestMain.class, args);
	}
}
