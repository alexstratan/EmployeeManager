package com.step.readEmployees;

import com.step.data.dataManager.EmployeeManager;
import com.step.data.Employees;
import com.step.ui.DisplayUI;
import java.util.Scanner;

public class ReadEmployees {

    public static void readFullEmployeeList(){
       DisplayUI.displayEmployeeListHeader();

        if(EmployeeManager.getEmployees().length==0){
            DisplayUI.displayNoEmployees();
        }
        else{
            for(Employees em: EmployeeManager.getEmployees()){
                DisplayUI.displayEmployeeDetails(em);
            }
        }
    }
                                                                                //pass here the array of employee's string values
    public static void readByStringValue(String message,String stringValue,String[] stringArray){
        Scanner sc=new Scanner(System.in);
        System.out.println(message);//e.g. "Enter the name:"
        stringValue=sc.nextLine();
        int index=0;
        for(String em: stringArray){
            if(stringValue.equals(em)){

                DisplayUI.displayEmployeeDetails(EmployeeManager.getEmployees()[index]);
                index++;
            }
        }
        if(index==0){
            System.out.println("No such employees were found. \nPress any key to continue.");
        }
        sc.nextLine(); // available for found and not found
    }

    public static void readByFunction(){
        Scanner sc=new Scanner(System.in);
        DisplayUI.displayFunctionOptions("Enter the function");
        int function=sc.nextInt();
        int index=0;
        for(String em: stringArray){
            if(stringValue.equals(em)){

                DisplayUI.displayEmployeeDetails(EmployeeManager.getEmployees()[index]);
                index++;
            }
        }
        if(index==0){
            System.out.println("No such employees were found. \nPress any key to continue.");
        }
        sc.nextLine(); // available for found and not found
    }

}
