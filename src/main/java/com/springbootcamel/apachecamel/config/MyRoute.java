package com.springbootcamel.apachecamel.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        System.out.println("started...");
        from("file:/Users/danielsunder/Documents/WORKSPACE/apache-camel/input")
                .to("file:/Users/danielsunder/Documents/WORKSPACE/apache-camel/output");
    }

}
