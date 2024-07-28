package behavioral.state;

public class TransitMode implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return null;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return null;
    }
}
