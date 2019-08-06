package by.grudnitsky.springcourse.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "GoodBoy";

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
