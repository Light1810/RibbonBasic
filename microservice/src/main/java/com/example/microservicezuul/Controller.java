package com.example.microservicezuul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Environment environment;
	
    @RequestMapping("/get")
    public String helloWorld(){
    	
        return "Hello World running on port : "+environment.getProperty("local.server.port");
    }


}
