package org.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class  MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    private MusicPlayer() {
    }

    //factory method
    public static MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    public List<Music> getMusic() {
        return musicList;
    }

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for(Music m : musicList)
        System.out.println("Now playing " + m.getSong());
    }

    public void doMyInit() {
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String toString() {
        return "Now playing " + this.getMusic().get(0) + "\n" +
                "with the volume " + this.getVolume() + "\n" +
                "on player \"" + this.getName() + "\"";
    }
}
