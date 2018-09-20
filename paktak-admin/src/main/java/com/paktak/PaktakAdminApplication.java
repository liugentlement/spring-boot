package com.paktak;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class PaktakAdminApplication {
	public static void main(String[] args) {
        System.out.print("spring-boot admin start......");
		SpringApplication.run(PaktakAdminApplication.class, args);
	}
}
