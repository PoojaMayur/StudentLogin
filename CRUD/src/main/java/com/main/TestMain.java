
package com.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages="com")
@SpringBootApplication(scanBasePackages="com")
@EnableJpaRepositories(basePackages="com")

public class TestMain {

	public static void main(String[] args) {
		System.out.println("main--main");
		
		
		SpringApplication.run(TestMain.class, args);
		System.out.println("main End");
	
	}
	}



