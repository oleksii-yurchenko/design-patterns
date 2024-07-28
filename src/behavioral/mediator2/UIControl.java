package behavioral.mediator2;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler handler){
        eventHandlers.add(handler);
    }

    protected void notifyObservers(){
        for (var handler : eventHandlers){
            handler.handle();
        }
    }
}
