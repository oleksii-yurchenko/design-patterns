package creational.factoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        var scheduler = new ScheduleArabic();
        scheduler.schedule(new Event());
    }
}
