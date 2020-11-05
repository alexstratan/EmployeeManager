package com.step.data.dataManager;
import com.step.data.Employees;

import java.util.Scanner;

public class EmployeeManager {

    private static Employees[] employees=new Employees[100];
    private static int nrOfEmployees=0;

    public static void addEmployee(Employees em){
        employees[nrOfEmployees]=em;
    }

    public static Employees[] getEmployees() {
        return employees;
    }

    public static int getNrOfEmployees(){
        return nrOfEmployees;
    }
}
