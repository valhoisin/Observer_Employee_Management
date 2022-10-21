package at.exercise.ObserverEmployeeMgmt.bl;

import java.util.Random;

public class KeyCard {
    private int cardNumber;

    public KeyCard(Employee employee){
        this.cardNumber = new Random().nextInt(100000,999999);
        employee.setKeyCard(this);
    }

    @Override
    public String toString() {
        return "KeyCard [id=<"+cardNumber+">]";
    }


}
