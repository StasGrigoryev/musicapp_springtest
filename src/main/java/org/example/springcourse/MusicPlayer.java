package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class  MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    //factory method
    public static MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
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

    public void playMusic(Genre genre) {

        try {
            switch (genre) {
                case CLASSICAL:
                    System.out.println("Now playing " + musicList.get(0).getSong());
                    break;
                case ROCK:
                    System.out.println("Now playing " + musicList.get(1).getSong());
                    break;
                case POP:
                    System.out.println("Now playing " + musicList.get(2).getSong());
                    break;
                default:
                    System.out.println("No such org.example.springcourse.genre found");
            }
        }
        catch(NullPointerException e) {
            System.out.println("The playlist is empty");
        }
        System.out.println("Name: " + getName() + "\n" +"Volume: " + getVolume());

    }

    public void doMyInit() {
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

}
