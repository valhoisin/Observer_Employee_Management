package at.exercise.ObserverEmployeeMgmt.bl;

public class EquipmentDB implements Observer{

  @Override
  public void employeeAdded(Employee emp) {
    System.out.println("Creating Equipment for " + emp.getName());
  }
}
