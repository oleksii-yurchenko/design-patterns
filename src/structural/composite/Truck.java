package structural.composite;

public class Truck implements EmergencyUnit{

    @Override
    public void deploy() {
        System.out.println("Deploying a truck");
    }
}
