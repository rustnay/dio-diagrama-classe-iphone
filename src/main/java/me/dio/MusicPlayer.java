package me.dio;

import java.util.ArrayList;
import java.util.Collection;

public interface MusicPlayer {

    Collection<Song> songs = new ArrayList<>();

    void play();
    void stop();
    void selectMusic();
}
