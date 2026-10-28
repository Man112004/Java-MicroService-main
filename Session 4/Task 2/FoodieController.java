package com.example.foodieservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodieController {

    @GetMapping("/foodie")
    public String getFood() {
        return "Welcome to FoodieService!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FoodieServiceApplication.class, args);
    }
}