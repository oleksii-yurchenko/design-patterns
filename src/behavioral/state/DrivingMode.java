package behavioral.state;

public class DrivingMode implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return null;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return null;
    }
}
