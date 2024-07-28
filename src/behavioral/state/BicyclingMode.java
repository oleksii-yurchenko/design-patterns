package behavioral.state;

public class BicyclingMode implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return null;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return null;
    }
}
