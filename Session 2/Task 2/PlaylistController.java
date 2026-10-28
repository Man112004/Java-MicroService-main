package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    List<Playlist> playlists = new ArrayList<>();

    @PostMapping
    public String addPlaylist(@RequestBody Playlist p) {
        playlists.add(p);
        return "Playlist added successfully";
    }

    @GetMapping
    public List<Playlist> getPlaylists() {
        return playlists;
    }

    @GetMapping("/{id}")
    public Playlist getPlaylist(@PathVariable int id) {
        for (Playlist p : playlists) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public String updatePlaylist(@PathVariable int id, @RequestBody Playlist newP) {
        for (Playlist p : playlists) {
            if (p.getId() == id) {
                p.setName(newP.getName());
                p.setSongs(newP.getSongs());
                return "Playlist updated successfully";
            }
        }
        return "Playlist not found";
    }

    @DeleteMapping("/{id}")
    public String deletePlaylist(@PathVariable int id) {
        for (Playlist p : playlists) {
            if (p.getId() == id) {
                playlists.remove(p);
                return "Playlist deleted successfully";
            }
        }
        return "Playlist not found";
    }
}