package com.ss.performiq;

import org.springframework.boot.SpringApplication;

public class TestPerformiqApplication {

	public static void main(String[] args) {
		SpringApplication.from(PerformiqApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
