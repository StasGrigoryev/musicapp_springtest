package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> playlist = new ArrayList<>();

    public void setPlaylist(List<String> playlist) {
        this.playlist = playlist;
        setMusic();
    }

    @PostConstruct
    private void setMusic(){
        this.playlist.add("\"Stairway to Heaven\" by Led Zeppelin");
        this.playlist.add("\"Paranoid Android\" by Radiohead");
        this.playlist.add("\"Scientist\" by Coldplay");
    }

    @Override
    public String getSong() {
        return playlist.get((int) Math.round((Math.random()*2)));
    }
}
