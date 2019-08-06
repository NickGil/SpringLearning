package by.grudnitsky.springcourse.weekDays;

public class Friday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return Friday.class.getSimpleName().toLowerCase();
    }
}
