package zaliczenie.projekt.wzorceProjektowe.backend.convrefresh;

import zaliczenie.projekt.wzorceProjektowe.backend.convrefresh.Observer;

public interface Subject {
    void conversationEntry(Observer o);
    void conversationLeave(Observer o);
    void addToObservers();
}
