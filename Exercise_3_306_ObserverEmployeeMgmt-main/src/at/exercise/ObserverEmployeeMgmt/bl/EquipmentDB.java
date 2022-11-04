package at.exercise.ObserverEmployeeMgmt.bl;

public class EquipmentDB implements Observer{

  @Override
  public void employeeAdded(Employee emp) {
    Chair chair = new Chair();
    chair.employeeAdded(emp);
    PC pc = new PC();
    pc.employeeAdded(emp);
  }
}
