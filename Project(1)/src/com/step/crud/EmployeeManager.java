package com.step.crud;
import com.step.data.Employees;

import java.util.Scanner;

public class EmployeeManager {

    private static Employees[] employees=new Employees[100]; // not final because we want to modify it
    private static int nrOfEmployees=0;

    public static void addEmployee(Employees em){
        employees[nrOfEmployees]=em;
        nrOfEmployees++;
    }

    public static void setEmployeeList(Employees[] newList){
        employees=newList;
    }

    public static Employees[] getEmployees() {
        return employees;
    }

    public static String[] getEmployeeNames() {
        String[] eNames=new String[100];
        for(int i=0;i<nrOfEmployees;i++){
            eNames[i]=employees[i].getName();
        }
        return eNames;
    }

    public static String[] getEmployeeSurnames() {
        String[] eSurnames=new String[100];
        for(int i=0;i<nrOfEmployees;i++){
            eSurnames[i]=employees[i].getSurname();
        }
        return eSurnames;
    }

    public static String[] getEmployeeIDNPs() {
        String[] eIDNPs=new String[100];
        for(int i=0;i<nrOfEmployees;i++){
            eIDNPs[i]=employees[i].getIDNP();
        }
        return eIDNPs;
    }

    public static int getEmployeeIndex(){
        Scanner sc=new Scanner(System.in);
        if(EmployeeManager.getNrOfEmployees()==0){
            System.out.println(" The employee list is currently empty. \n Press any key to return to the menu.");
            sc.nextLine();
            return -1;
        }
        int index;
        while(true){
            System.out.println("Enter the index of the employee: ");
            index = sc.nextInt();
            if(index<EmployeeManager.getNrOfEmployees()&&index>=0)break;// todo: maybe go back to the menu if this is false (or let the use exit the process)
            System.out.println("Invalid index value. Try again");
            sc.nextLine();
        }
        return index;
    }
    public static void decrementNrOfEmployees(){
        nrOfEmployees--;
    }
    public static int getNrOfEmployees(){
        return nrOfEmployees;
    }
}
