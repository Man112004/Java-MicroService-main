package com.example.userprofileservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "playlist-service", url = "http://localhost:8085")
public interface PlaylistClient {

    @GetMapping("/playlists/{id}")
    Playlist getPlaylist(@PathVariable("id") int id);
}