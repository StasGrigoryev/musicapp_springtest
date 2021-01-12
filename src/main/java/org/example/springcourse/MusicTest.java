package org.example.springcourse;

import org.example.springcourse.config.MusicConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MusicConfig.class);
        Computer computer = context.getBean("computerBean", Computer.class);
        computer.boot();

        context.close();
    }
}
