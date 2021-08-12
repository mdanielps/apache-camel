package com.springbootcamel.apachecamel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class ApacheCamelApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ApacheCamelApplication.class, args);
		System.out.println("Printing out --");
		Map<String, RouteBuilder> routeBuilders =
				ctx.getBeansOfType(RouteBuilder.class);
		System.out.println(routeBuilders);

		CamelSpringBootApplicationController applicationController =
				ctx.getBean(CamelSpringBootApplicationController.class);
		applicationController.run();
	}

}
