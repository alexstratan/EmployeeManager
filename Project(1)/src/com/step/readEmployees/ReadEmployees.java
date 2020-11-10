package com.step.readEmployees;

import com.step.data.dataManager.EmployeeManager;
import com.step.ui.DisplayUI;
import java.util.Scanner;

public class ReadEmployees {

    public static int readById(){ // this function will be as a parameter to the update function
        Scanner sc=new Scanner(System.in);
        int id;
        boolean notFound;
        do{
            DisplayUI.readByIdMessage();
            id = sc.nextInt();
            // EmployeeManager.getNrOfEmployees will always be max index + 1
            notFound = id> EmployeeManager.getNrOfEmployees();
            if(notFound){
                System.out.println("Index unavailable. Try again: ");
            }
        }while(notFound);
        return id;
    }


    public static void readFullEmployeeList(){
       DisplayUI.displayEmployeeListHeader();

        if(EmployeeManager.getNrOfEmployees()==0){
            DisplayUI.displayNoEmployees();
        }
        else{
            for(int i=0;i<EmployeeManager.getNrOfEmployees();i++){
                DisplayUI.displayEmployeeDetails(EmployeeManager.getEmployees()[i]);
            }
//            for(Employees em: EmployeeManager.getEmployees()){   //can't use this type of for because we are using an array
//                DisplayUI.displayEmployeeDetails(em);
//            }
        }
    }
                                                                                //pass here the array of employee's string values
    public static void readByStringValue(String message,String[] stringArray){
        Scanner sc=new Scanner(System.in);
        System.out.println(message);//e.g. "Enter the name:"
        String searchByValue=sc.nextLine();
        int index=0;
        for(String em: stringArray){
            if(searchByValue.equals(em)){

                DisplayUI.displayEmployeeDetails(EmployeeManager.getEmployees()[index]);
                index++;
            }
        }
        if(index==0){
            System.out.println("No such employees were found. \nPress any key to continue.");
        }
        sc.nextLine(); // available for found and not found
    }

    //todo:  later implement search by other fields

}
