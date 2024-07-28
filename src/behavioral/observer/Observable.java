package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void  removeObserver(Observer obs){
        observers.remove(obs);
    }

    public void updateObservers(){
        for (var obs : observers){
            obs.update();
        }
    }
}
