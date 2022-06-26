package zaliczenie.projekt.wzorceProjektowe.backend.convrefresh;

import java.util.ArrayList;
import java.util.List;

public class CurrentConversation implements Subject {

    private ArrayList<Observer> observers;

    public CurrentConversation() {
        observers = new ArrayList<>();
    }

    @Override
    public void conversationEntry(Observer o) {
        observers.add(o);
    }

    @Override
    public void conversationLeave(Observer o) {
        observers.remove(o);
    }

    @Override
    public void addToObservers() {
        for (Observer o : observers) {
            o.entry();
        }
    }
}
