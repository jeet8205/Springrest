package com.example.bootspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AccessingDataMysqlApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMysqlApplication.class, args);
	}
}
