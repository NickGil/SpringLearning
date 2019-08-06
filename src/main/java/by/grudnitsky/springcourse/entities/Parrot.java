package by.grudnitsky.springcourse.entities;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Kesha";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
