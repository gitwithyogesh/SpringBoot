package com.example.First_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerHello {
    
    @GetMapping("/resthello")
    public String restHello(){
        return "<h1>Hello World Using Rest Controller</h1>";
    }

    @GetMapping("/resthello1")
    public String restHello1(){
        return "<h2>Hello World Using Rest Controller 111</h2>";
    }
}
