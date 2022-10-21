package at.exercise.ObserverEmployeeMgmt.bl;

import java.util.ArrayList;
import java.util.List;

public class KeyCardDB implements Observer{

  private List<KeyCard> cardList = new ArrayList<>();

  @Override
  public void employeeAdded(Employee emp) {
    KeyCard card = new KeyCard(emp);
    cardList.add(card);
    System.out.println("Creating Key Card for " + emp.getName());
  }

}
