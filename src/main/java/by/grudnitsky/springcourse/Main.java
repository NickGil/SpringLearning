package by.grudnitsky.springcourse;

import by.grudnitsky.springcourse.configs.MyConfig;
import by.grudnitsky.springcourse.entities.Cat;
import by.grudnitsky.springcourse.entities.Dog;
import by.grudnitsky.springcourse.entities.Parrot;
import by.grudnitsky.springcourse.weekDays.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("getDog");
        Parrot bean = context.getBean("parrot-kesha", Parrot.class);

        WeekDay weekDay = context.getBean(WeekDay.class);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(bean);

        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
