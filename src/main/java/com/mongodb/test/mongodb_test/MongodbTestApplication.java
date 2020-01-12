package com.mongodb.test.mongodb_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mongodb.test.mongodb_test"})
public class MongodbTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbTestApplication.class, args);
	}

}
