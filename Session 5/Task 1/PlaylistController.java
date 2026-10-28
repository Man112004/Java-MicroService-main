package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    @GetMapping("/playlists/{id}")
    public Playlist getPlaylist(@PathVariable int id) {
        return new Playlist(id, "My Favorite Songs", "Jatin");
    }
}