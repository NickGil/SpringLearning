package by.grudnitsky.springcourse.weekDays;

public class Tuesday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return Tuesday.class.getSimpleName().toLowerCase();
    }
}
