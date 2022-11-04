package at.exercise.ObserverEmployeeMgmt.bl;

public class Chair extends EquipmentDB {

    @Override
    public void employeeAdded(Employee emp) {
        System.out.println("Chair created for " + emp.getName());
    }
}
