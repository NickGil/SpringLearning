package by.grudnitsky.springcourse.weekDays;

public class Wednesday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return Wednesday.class.getSimpleName().toLowerCase();
    }
}
