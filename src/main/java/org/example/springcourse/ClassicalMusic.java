package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> playlist = new ArrayList<>();

    public void setPlaylist(List<String> playlist) {
        this.playlist = playlist;
        setMusic();
    }

    @PostConstruct
    private void setMusic(){
        this.playlist.add("\"Symphony #5\" by Beethoven");
        this.playlist.add("\"Suite No. 1 in G major\" by J.S. Bach");
        this.playlist.add("\"Nocturne in B-flat minor\" by Fredric Chopin");
    }
    @Override
    public String getSong() {
        return playlist.get((int) Math.round((Math.random()*2)));
    }
}
