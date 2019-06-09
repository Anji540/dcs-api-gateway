package com.datacenter.dcsapigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class DcsApiGatewayApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DcsApiGatewayApplication.class);
	
    public static void main(String[] args) {
    	
        SpringApplication.run(DcsApiGatewayApplication.class, args);
        logger.info("DcsApiGatewayApplication started and registered with Discovery server");
    }
}
