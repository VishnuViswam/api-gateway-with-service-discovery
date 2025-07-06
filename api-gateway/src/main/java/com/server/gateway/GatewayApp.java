package com.server.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApp {

	private static final Logger logger = LoggerFactory.getLogger(GatewayApp.class);

	{
		logger.info("Gateway Application is starting.....");
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApp.class, args);
		logger.info("Gateway Application is started !!");
	}
}
