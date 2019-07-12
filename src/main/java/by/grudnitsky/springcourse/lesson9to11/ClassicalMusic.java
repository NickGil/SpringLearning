package by.grudnitsky.springcourse.lesson9to11;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>(Arrays.asList("Hungarian Rhapsody#1", "Hungarian Rhapsody#2",
            "Hungarian Rhapsody#3"));

    @Override
    public String getSong(int i) {
        return songs.get(i);
    }
}
