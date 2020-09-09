package com.spring.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootUserProducerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserProducerMicroServiceApplication.class, args);
	}
}
