package com.rnocoders.trainticketing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello Boomers";
    }
}
