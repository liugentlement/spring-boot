package com.imuk.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring cloud server config 配置中心
 */
@SpringBootApplication
public class CloudConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
	}
}
