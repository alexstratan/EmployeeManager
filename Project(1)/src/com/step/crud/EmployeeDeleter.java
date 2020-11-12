package com.step.crud;

import com.step.data.Employees;
import java.util.Scanner;

public class EmployeeDeleter {

    public static void fireEmployee(int index){ // change the index of all employees (only for basic arrays)
        Scanner sc = new Scanner(System.in);
        if(index<0){return;}

        String idnp = EmployeeManager.getEmployees()[index].getIDNP();
        Employees[] employees=new Employees[100];
        EmployeeManager.decrementNrOfEmployees();
        for(int i=0,l=0;i<EmployeeManager.getNrOfEmployees();i++,l++){
            if(i==index){i--;index=-1;continue;}
            employees[i]=EmployeeManager.getEmployees()[l];
        }
        EmployeeManager.setEmployeeList(employees);
        System.out.println("Employee with idnp "+idnp+ " has been successfully fired. Press any key to continue. ");
        sc.nextLine();
    }
}
