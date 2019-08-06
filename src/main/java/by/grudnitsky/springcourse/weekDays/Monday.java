package by.grudnitsky.springcourse.weekDays;

public class Monday implements WeekDay {

    @Override
    public String getWeekDayName() {
        return Monday.class.getSimpleName().toLowerCase();
    }
}
