package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    @GetMapping("/recommendations")
    public String getRecommendations() {
        return "Recommended playlists: Romantic Hits, Workout Mix, Chill Vibes";
    }
}