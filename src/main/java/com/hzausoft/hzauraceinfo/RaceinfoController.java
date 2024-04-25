package com.hzausoft.hzauraceinfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaceinfoController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }
}