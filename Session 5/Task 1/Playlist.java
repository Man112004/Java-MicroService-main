package com.example.model;

public class Playlist {

    private int id;
    private String name;
    private String creator;

    public Playlist(int id, String name, String creator) {
        this.id = id;
        this.name = name;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }
}