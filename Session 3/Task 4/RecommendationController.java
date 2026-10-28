package com.example.controller;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    private DiscoveryClient discoveryClient;

    public RecommendationController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/recommendations")
    public String getRecommendations() {

        List<ServiceInstance> instances = discoveryClient.getInstances("MusicService");

        for (ServiceInstance instance : instances) {
            System.out.println("Host: " + instance.getHost());
            System.out.println("Port: " + instance.getPort());
        }

        return "MusicService instances fetched successfully!";
    }
}
