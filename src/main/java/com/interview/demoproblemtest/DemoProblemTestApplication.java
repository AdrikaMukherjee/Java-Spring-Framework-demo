package com.interview.demoproblemtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*tags the class as a source of bean definitions for the application context, 
 * tells Spring Boot to start adding beans based on classpath settings,
 * This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
 * */
@SpringBootApplication
public class DemoProblemTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProblemTestApplication.class, args);
	}

}

