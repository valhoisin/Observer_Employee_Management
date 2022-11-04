package at.exercise.ObserverEmployeeMgmt.ui;

import at.exercise.ObserverEmployeeMgmt.bl.*;


import java.util.Scanner;

public class EmployeeMgmtUI {

    private final static EmployeeDB employeeDB = new EmployeeDB();

    public static void main(String[] args) {
      //  EmployeeDB employeeDB = new EmployeeDB();
        EquipmentDB equipmentDB = new EquipmentDB();
        KeyCardDB keyCardDB = new KeyCardDB();

        employeeDB.registerObserver(keyCardDB);
        employeeDB.registerObserver(equipmentDB);


    /*
    Employee employee = new Employee("David Valh", "28.07.1990");
    employeeDB.addEmployee(employee);


    System.out.println(employee);
    System.out.println(employeeDB.createEmployeeList());
    */
        int navigation;

        do {
            System.out.println("Welcome to the Employee Management System");
            System.out.println("==========================================");
            System.out.println("1. Add Employee\n2. Print Employee\n3. Export Employees to File\n0. Quit");

            navigation = new Scanner(System.in).nextInt();
            switch (navigation) {
                case 1 -> addEmp(employeeDB);
                case 2 -> printEmployees(employeeDB);
                case 3 -> System.out.println("How?");
            }
        } while (navigation != 0);

    }

    public static void addEmp(EmployeeDB empDB) {
        System.out.println("Name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Date of Birth:");
        String birth = new Scanner(System.in).nextLine();
        Employee emp = new Employee(name, birth);
        empDB.addEmployee(emp);
    }

    public static void printEmployees(EmployeeDB empDB) {
        String empList = empDB.createEmployeeList();
        System.out.println(empList);
    }

}
