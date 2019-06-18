package com.example.FeignClientdemo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice")
@RibbonClient(name = "microservice")
public interface ProxyInterface {
    @GetMapping("/get")
    public String getbyfeign();
}
