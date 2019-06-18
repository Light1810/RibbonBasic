package com.example.FeignClientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@org.springframework.cloud.openfeign.EnableFeignClients
public class FeignClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientDemoApplication.class, args);
	}

}
