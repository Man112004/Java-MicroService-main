package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.model.Playlist;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    List<Playlist> list = new ArrayList<>();
    int id = 1;

    @PostMapping
    public Playlist addPlaylist(@RequestBody Playlist p) {
        p.setId(id++);
        list.add(p);
        return p;
    }

    @GetMapping
    public List<Playlist> getPlaylists() {
        return list;
    }

    @GetMapping("/{id}")
    public Playlist getPlaylist(@PathVariable int id) {
        for (Playlist p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deletePlaylist(@PathVariable int id) {
        for (Playlist p : list) {
            if (p.getId() == id) {
                list.remove(p);
                return "Playlist deleted successfully";
            }
        }
        return "Playlist not found";
    }
}