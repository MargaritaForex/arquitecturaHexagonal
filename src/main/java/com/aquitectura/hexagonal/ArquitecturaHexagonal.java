package com.aquitectura.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.aquitectura.hexagonal")
public class ArquitecturaHexagonal {

	public static void main(String[] args) {
		SpringApplication.run(ArquitecturaHexagonal.class, args);
	}

}
