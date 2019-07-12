package by.grudnitsky.springcourse.lesson9to11;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        //context.getBean("musicPlayer", MusicPlayer.class).playMusic();


        /*Music music1 = context.getBean("rockMusic", Music.class);
        Music music2 = context.getBean("classicalBean", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();*/

        context.close();
    }
}
