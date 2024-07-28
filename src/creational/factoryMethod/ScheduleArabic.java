package creational.factoryMethod;

public class ScheduleArabic extends Schedule {
    @Override
    protected Calendar createCalendar() {
        return new CalendarArabic();
    }
}
