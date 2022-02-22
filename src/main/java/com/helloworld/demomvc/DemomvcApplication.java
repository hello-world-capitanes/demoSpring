package com.helloworld.demomvc;

import com.helloworld.demomvc.services.GreetingService;
import com.helloworld.demomvc.services.implementation.GreetingDayPartServiceImpl;
import com.helloworld.demomvc.services.implementation.GreetingServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemomvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomvcApplication.class, args);
	}

	@Bean
	public GreetingService getGreetingService(Environment environment){
		String greetingServiceType = environment.getProperty("greeting-service-type");
		if(greetingServiceType.equals("regular")){
			return new GreetingServiceImpl();
		} else {
			return new GreetingDayPartServiceImpl();
		}
	}

}
