package com.spboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @Configuration, @EnableAutoConfiguration, @ComponentScan을 포함
public class SpboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpboardApplication.class, args);
	}

}
