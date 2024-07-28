package creational.factoryMethod;

import java.util.Date;

public class Schedule {
    private Calendar calendar = createCalendar();

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }

    protected Calendar createCalendar(){
        return new CalendarGregorian();
    }
}
