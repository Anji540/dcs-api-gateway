package com.datacenter.dcsapigateway.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class GatewayController { 
	
	@Autowired
	Environment env;
   
    @RequestMapping("/health/{topic}")
    public String extractJob(@PathVariable("topic") String topic) throws Exception {
    
        return "GatewayController Status is UP : App Name : "+env.getProperty("spring.application.name");
    }
    
     
}