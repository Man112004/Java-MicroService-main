package com.example.foodieservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FoodieController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/foodie")
    public String getFood() {
        System.out.println("Request handled by FoodieService on port: " + port);
        return "Welcome to FoodieService! Port: " + port;
    }
}