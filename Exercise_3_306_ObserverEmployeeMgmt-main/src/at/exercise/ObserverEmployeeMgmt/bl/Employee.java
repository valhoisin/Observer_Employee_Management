package at.exercise.ObserverEmployeeMgmt.bl;

import java.util.Random;

public class Employee {

    private final String name;

    private KeyCard keyCard;
    private String birthDay;
    private int salary;

    public Employee(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public KeyCard getKeyCard() {
        return keyCard;
    }

    public void setKeyCard(KeyCard keyCard) {
        this.keyCard = keyCard;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Employee [name="+name+", dateOfBirth="+birthDay+"] ["+keyCard+"]";
    }
}
