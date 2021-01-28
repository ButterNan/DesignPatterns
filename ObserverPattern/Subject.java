package ObserverPattern;

public interface Subject {
public void registerObserver(Observer o);
public void unregisterObserver(Observer o);
public void notifyObserver();
public Object getUpdate(Observer o);

}
