package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudCnfigServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(CloudCnfigServerApplication.class, args);
	}

}
