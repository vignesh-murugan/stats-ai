package com.vm.ai.statsai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@SwaggerDefinition(basePath = "/api/v1", 
		info = @Info(title = "Stats AI REST API", 
		description = "sample springboot couchbase REST API", 
		version = "v1", 
		contact = @Contact(
				email = "vicky.mkce@gmail.com", 
				name = "vignesh")), 
		host = "localhost:8080")
@RequestMapping("/api/v1")
public class StatsAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatsAiApplication.class, args);
	}
}
