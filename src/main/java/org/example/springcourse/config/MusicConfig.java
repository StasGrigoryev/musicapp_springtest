package org.example.springcourse.config;

import org.example.springcourse.*;
import org.example.springcourse.genre.ClassicalMusic;
import org.example.springcourse.genre.PopMusic;
import org.example.springcourse.genre.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("org/example/springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class MusicConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(),rockMusic(),popMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computerBean() {
        return new Computer(musicPlayer());
    }
}
