package by.grudnitsky.springcourse.weekDays;

public class Thursday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return Thursday.class.getSimpleName().toLowerCase();
    }

}
