package models;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObserver();
}
