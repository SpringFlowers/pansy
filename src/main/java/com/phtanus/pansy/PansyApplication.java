package com.phtanus.pansy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PansyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PansyApplication.class, args);
	}
}
