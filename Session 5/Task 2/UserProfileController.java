package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

    private PlaylistClient playlistClient;

    public UserProfileController(PlaylistClient playlistClient) {
        this.playlistClient = playlistClient;
    }

    @GetMapping("/userprofile/playlist/{id}")
    public Playlist getUserPlaylist(@PathVariable int id) {
        return playlistClient.getPlaylist(id);
    }
}