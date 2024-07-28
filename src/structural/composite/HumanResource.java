package structural.composite;

public class HumanResource implements EmergencyUnit{

    @Override
    public void deploy() {
        System.out.println("Deploying a human resource");
    }
}
