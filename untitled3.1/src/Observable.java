import  java.util.List;
import java.util.ArrayList;

public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers(SystemAlert alert) {
        for (Observer observer : observers) {
            observer.notify(alert);
        }
    }
}