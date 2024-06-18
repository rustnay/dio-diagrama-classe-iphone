package me.dio;

import java.util.UUID;

public class Song {

    private UUID id;
    private String name;

    private String path;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
