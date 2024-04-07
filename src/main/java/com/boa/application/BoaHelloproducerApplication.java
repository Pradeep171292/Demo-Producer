package com.boa.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan("com.boa.*")
@EnableDiscoveryClient
public class BoaHelloproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaHelloproducerApplication.class, args);
	}

}
