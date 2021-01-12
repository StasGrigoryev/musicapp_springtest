package org.example.springcourse.genre;

import org.example.springcourse.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {
    private List<String> playlist = new ArrayList<>();


    public void setPlaylist(List<String> playlist) {
        this.playlist = playlist;
        setMusic();
    }

    @PostConstruct
    private void setMusic(){
        this.playlist.add("\"Seniorita\" by Shawn Mendez");
        this.playlist.add("\"Shape Of You\" by Ed Sheeran");
        this.playlist.add("\"Sorry\" by Justin Bieber");
    }

    @Override
    public String getSong() {
        return playlist.get((int) Math.round((Math.random()*2)));
    }
}
