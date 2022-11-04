package at.exercise.ObserverEmployeeMgmt.bl;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private final ArrayList<Employee> employeeList = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Employee emp) {
        for (Observer o : observers) {
            o.employeeAdded(emp);
        }
    }

    public void addEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
        notifyObservers(newEmployee);
    }

    public String createEmployeeList() {
        String output = "";
        for (Employee e : employeeList) {
            output += e.toString() + "\n";
        }
        return output;
    }

}
