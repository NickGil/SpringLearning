package by.grudnitsky.springcourse.weekDays;

public class Sunday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return Sunday.class.getSimpleName().toLowerCase();
    }
}
