package com.carmanagementApp.carstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages = "com.carmanagementApp.carstore")
@EnableSwagger2
@SpringBootApplication
public class CarstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarstoreApplication.class, args);
	}
}
