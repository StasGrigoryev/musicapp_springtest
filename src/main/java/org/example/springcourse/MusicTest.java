package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.playMusic();
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer2.playMusic();

        context.close();
    }
}
