package at.exercise.ObserverEmployeeMgmt.bl;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(Employee emp);
}
