package com.stackroute.foodieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FoodieServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(FoodieServiceApplication.class, args);
	}

}
