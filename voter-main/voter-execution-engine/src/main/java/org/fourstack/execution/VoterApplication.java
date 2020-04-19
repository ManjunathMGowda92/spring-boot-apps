package org.fourstack.execution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = "org.fourstack")
public class VoterApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VoterApplication.class, args);
	}
}
