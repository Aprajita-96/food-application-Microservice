package com.example.Zulimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZulimplApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZulimplApplication.class, args);
	}

}
