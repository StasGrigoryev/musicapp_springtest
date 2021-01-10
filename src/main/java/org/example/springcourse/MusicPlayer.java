package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class  MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;
    private String name;
    private int volume;

    private MusicPlayer() {
    }

    //factory method
    public static MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    @Autowired
    public void setMusic(@Qualifier("classicalMusic") Music classic,
                         @Qualifier("rockMusic") Music rock,
                         @Qualifier("popMusic") Music pop) {
        this.music1 = classic;
        this.music2 = rock;
        this.music3 = pop;
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

        switch(genre) {
            case CLASSICAL:
                System.out.println("Now playing " + music1.getSong());
                break;
            case ROCK:
                System.out.println("Now playing " + music2.getSong());
                break;
            case POP:
                System.out.println("Now playing " + music3.getSong());
                break;
            default:
                System.out.println("No such genre found");
        }


    }

    public void doMyInit() {
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

}
