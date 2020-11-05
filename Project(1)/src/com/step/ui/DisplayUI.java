package com.step.ui;
import com.step.data.Employees;

public class DisplayUI {

    public static void displayMainMenu(){
        System.out.println("\n\n\n        *** Employee management ***");
        System.out.println("\n          1. Register new employees ");
        System.out.println("          2. View all the employees ");
        System.out.println("          3. Modify employee data ");
        System.out.println("          4. Fire an employee ");
    }

    public static void displayEmployeeDetails(Employees em){
        System.out.println("-----------"+em.getName()+' '+ em.getSurname()+"-----------");
        System.out.println("IDNP: "+em.getIDNP());
        System.out.println("Gender: "+em.getGender().toString());
        System.out.println("Function: "+em.getFunction().toString());
        System.out.println("Salary: "+em.getSalary()+'$');
        System.out.println("Birthdate: "+em.getBirthDate().toString());
        System.out.println("Employment date: "+em.getEmployedOn().toString());
    }

    public static void displayNoEmployees(){
        System.out.println("There are no employees registered in the company");
    }

    public static void displayEmployeeListHeader(){
        System.out.println("\n\n        ---> The list of all the registered employees <---");
    }

    public static void displayFunctionOptions(String introductory){
        System.out.println(introductory+"\n" +
                "1-System Engineer    2-Network Engineer\n " +
                "3-System Administrator    4-Project Manager\n" +
                "5-Helpdesk    6-Desktop Support :");//todo: se if starts with 1 or 0
    }
}
