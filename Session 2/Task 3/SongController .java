package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @GetMapping("/songs")
    public List<Song> getSongs() {

        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Perfect", "Ed Sheeran", 263));
        songs.add(new Song(2, "Believer", "Imagine Dragons", 204));
        songs.add(new Song(3, "Memories", "Maroon 5", 189));

        return songs;
    }
}