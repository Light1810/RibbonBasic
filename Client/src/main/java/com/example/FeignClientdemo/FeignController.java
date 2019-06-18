package com.example.FeignClientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private ProxyInterface proxy;
    @GetMapping("/feignbyget")
    public String getfeign(){
        return proxy.getbyfeign();
    }
}
