package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Main {

	private static ApplicationContext context;

	public static <T> T getBean(Class<T> requiredType) {
		return context.getBean(requiredType);
	}

	public static void main(String... args) throws Exception {
		context = SpringApplication.run(Main.class, args);
	}

}
