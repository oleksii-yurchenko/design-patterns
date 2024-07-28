package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements EmergencyUnit{
    private List<EmergencyUnit> units = new ArrayList<>();

    public void add(EmergencyUnit unit) {
        units.add(unit);
    }

    @Override
    public void deploy() {
        for (var unit : units)
            unit.deploy();
    }
}
