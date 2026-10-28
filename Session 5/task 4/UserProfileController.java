
package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import feign.FeignException;

@RestController
public class UserProfileController {

    private PlaylistClient playlistClient;

    public UserProfileController(PlaylistClient playlistClient) {
        this.playlistClient = playlistClient;
    }

    @GetMapping("/userprofile/playlist/{id}")
    public String getPlaylist(@PathVariable int id) {

        try {
            Playlist p = playlistClient.getPlaylist(id);
            return p.getName();

        } catch (FeignException.NotFound e) {
            return "Playlist not found";
        }
    }
}
