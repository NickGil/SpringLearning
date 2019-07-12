package by.grudnitsky.springcourse.lesson9to11;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>(Arrays.asList("Cheer Up London#1", "Cheer Up London#2",
            "Cheer Up London#3"));

    @Override
    public String getSong(int i) {
        return songs.get(i);
    }


}
