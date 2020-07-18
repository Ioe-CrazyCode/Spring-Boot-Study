package com.ioenn.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;
    @GetMapping("hi")
    public String home (){
        return "Hi,idea,idea,idea,idea"+ port;
    }
}
