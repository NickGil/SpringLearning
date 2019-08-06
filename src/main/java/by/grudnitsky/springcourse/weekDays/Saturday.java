package by.grudnitsky.springcourse.weekDays;

public class Saturday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return Saturday.class.getSimpleName().toLowerCase();
    }
}
