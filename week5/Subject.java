package week5;
// Observer
public interface Subject {
    // all these are abstract methods
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();

}
