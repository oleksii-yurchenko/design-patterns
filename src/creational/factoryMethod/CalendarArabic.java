package creational.factoryMethod;

import java.util.Date;

public class CalendarArabic implements Calendar{
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Arabic Calendar adding event implementation");
    }
}
