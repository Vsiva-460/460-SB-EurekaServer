package com.sivasoft.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaserverexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaserverexampleApplication.class, args);
	}

}
