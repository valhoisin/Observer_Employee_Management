package at.exercise.ObserverEmployeeMgmt.bl;

public class PC extends EquipmentDB {
    @Override
    public void employeeAdded(Employee emp) {
        System.out.println("PC created for " + emp.getName());
    }
}
