package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @GetMapping("/music")
    public String getMusic() {
        return "Welcome to MusicService! Available songs: Song 1, Song 2, Song 3";
    }
}