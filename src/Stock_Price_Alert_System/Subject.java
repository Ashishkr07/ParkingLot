package Stock_Price_Alert_System;

public interface Subject {

    void register(Observer newObserver);
    void unregister(Observer observer);
}
