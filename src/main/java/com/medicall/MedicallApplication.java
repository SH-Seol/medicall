package com.medicall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MedicallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicallApplication.class, args);
	}

}
