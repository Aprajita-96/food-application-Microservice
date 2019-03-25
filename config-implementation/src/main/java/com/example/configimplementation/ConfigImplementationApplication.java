package com.example.configimplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigImplementationApplication.class, args);
	}

}
