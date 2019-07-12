package by.grudnitsky.springcourse.lesson9to11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music music;
    private Music music2;

    @Autowired

    public MusicPlayer(@Qualifier("classicalMusic")Music music, @Qualifier("rockMusic")Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String playMusic(MusicGenres genre) {

        Random random = new Random();

        if (genre == MusicGenres.CLASSICAL){
            return music.getSong(random.nextInt(3));
        }
        if (genre == MusicGenres.ROCK){
            return music2.getSong(random.nextInt(3));
        }
        return "Genre is not found";
    }
}
