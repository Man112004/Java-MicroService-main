package com.example.model;

public class Track {

    private int id;
    private String name;
    private String artist;

    public Track() {
    }

    public Track(int id, String name, String artist) {
        this.id = id;
        this.name = name;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}