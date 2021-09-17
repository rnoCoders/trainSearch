package com.rnocoders.trainticketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.rnocoders.trainticketing")
@SpringBootApplication
public class TrainTicketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainTicketingApplication.class, args);
	}

}
