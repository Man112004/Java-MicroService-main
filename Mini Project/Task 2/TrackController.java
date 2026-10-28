package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.model.Track;

@RestController
@RequestMapping("/tracks")
public class TrackController {

    List<Track> list = new ArrayList<>();
    int id = 1;

    @PostMapping
    public Track addTrack(@RequestBody Track t) {
        t.setId(id++);
        list.add(t);
        return t;
    }

    @GetMapping
    public List<Track> getTracks() {
        return list;
    }

    @GetMapping("/{id}")
    public Track getTrack(@PathVariable int id) {
        for (Track t : list) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}