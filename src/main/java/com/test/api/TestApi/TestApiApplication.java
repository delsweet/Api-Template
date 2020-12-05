package com.test.api.TestApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestApiApplication implements CommandLineRunner {

	@Value("${NAME}")
	private String name;
	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.print("name printed"+name);

	}
}
