package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class PlaylistController {

    @GetMapping("/songs")
    public List<Object> getSongs() {

        RestTemplate restTemplate = new RestTemplate();

        Object[] songs = restTemplate.getForObject(
                "http://localhost:8081/songs",
                Object[].class);

        return Arrays.asList(songs);
    }
}