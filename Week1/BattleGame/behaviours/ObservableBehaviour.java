package behaviours;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;
import observer.Subject;

public abstract class ObservableBehaviour implements Behaviour, Subject {
    private String name;
     public ObservableBehaviour(String name) {
        this.name = name;
    }
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
    @Override
    public String getSubject() {
        return this.name;
    }
}