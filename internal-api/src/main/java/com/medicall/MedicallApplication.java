package com.medicall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.medicall")
public class MedicallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicallApplication.class, args);
	}

}
