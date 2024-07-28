package creational.abstractFactory;

public class Demo {
    public static void main(String[] Args) {
        var homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
    }
}
