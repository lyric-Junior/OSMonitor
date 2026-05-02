package com.server.osinspector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
public class OsinspectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsinspectorApplication.class, args);
	}

	@Scheduled
	public void scheduled() {

	}


}
