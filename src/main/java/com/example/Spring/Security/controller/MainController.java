package com.example.Spring.Security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/gretting")
    public String greeting(Authentication authentication){
        String username = authentication.getName();

        return  "Spring security memory auth example: Hello "+username;
    }

}
