package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        Computer computer = context.getBean("computer", Computer.class);
        computer.boot();

        context.close();
    }
}
