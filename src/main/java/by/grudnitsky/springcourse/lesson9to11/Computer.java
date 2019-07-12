package by.grudnitsky.springcourse.lesson9to11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Override
    public String toString() {
        return "Computer " + id + " \n" + musicPlayer.playMusic(MusicGenres.ROCK);
    }

    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        id = 1;
        this.musicPlayer = musicPlayer;
    }
}
