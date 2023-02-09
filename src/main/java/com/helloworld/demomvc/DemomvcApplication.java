package com.helloworld.demomvc;

import com.helloworld.demomvc.config.LogUtil;
import com.helloworld.demomvc.services.GreetingService;
import com.helloworld.demomvc.services.implementation.GreetingDayPartServiceImpl;
import com.helloworld.demomvc.services.implementation.GreetingServiceImpl;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemomvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemomvcApplication.class, args);
		if(args.length > 0) {
			LogUtil.writeLog("INFO", String.format("first command-line parameter: '%s'", args[0]), null);
		}
	}

	@Bean
	public GreetingService getGreetingService(Environment environment){
		String greetingServiceType = environment.getProperty("greeting-service-type");
		LogUtil.writeLog("DEBUG", String.format("Greeting service type - '%s'", greetingServiceType), null);
		if(greetingServiceType.equals("regular")){
			return new GreetingServiceImpl();
		} else {
			return new GreetingDayPartServiceImpl();
		}
	}

}