package com.justin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.justin"})
@EnableJpaRepositories("com.justin.jpa.dao")
@EntityScan("com.justin.jpa.model")
public class BootServer {

	public static void main(String[] args) {
		System.out.println("GOGOGO~~");
		SpringApplication.run(BootServer.class, args);
		
	}

}
