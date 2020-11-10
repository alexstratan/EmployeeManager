package com.step.data.dataManager;
import com.step.data.Employees;

public class EmployeeManager {

    private static final Employees[] employees=new Employees[100];
    private static int nrOfEmployees=0;

    public static void addEmployee(Employees em){
        employees[nrOfEmployees]=em;
        nrOfEmployees++;
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

    public static int getNrOfEmployees(){
        return nrOfEmployees;
    }
}
