package com.step.ui;
import com.step.data.Employees;

public class DisplayingUI {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void displayUpdateMenu(){
        System.out.println("\n\n\n        *** Employee update values ***");
        System.out.println("\n          1. Update name ");
        System.out.println("          2. Update surname ");
        System.out.println("          3. Update IDNP ");
        System.out.println("          4. Update birth date ");
        System.out.println("          5. Update employment date ");
        System.out.println("          6. Update salary ");
        System.out.println("          7. Update function ");
        System.out.println("          8. Go back ");
    }

    public static void displayMainMenu(){
        System.out.println("\n\n\n        *** Employee management ***");
        System.out.println("\n          1. Register new employees ");
        System.out.println("          2. View employees ");
        System.out.println("          3. Modify employee data ");
        System.out.println("          4. Fire an employee ");
        System.out.println("          5. Exit ");
    }

    public static void displaySearchMenu(){
        System.out.println("\n\n\n        *** Employee search ***");
        System.out.println("\n          1. Display every employee ");
        System.out.println("          2. Search by name ");
        System.out.println("          3. Search by surname ");
        System.out.println("          4. Search by IDNP ");
        System.out.println("          5. Go back ");
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
