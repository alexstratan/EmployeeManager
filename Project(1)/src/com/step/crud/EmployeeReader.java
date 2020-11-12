package com.step.crud;

import com.step.ui.DisplayingUI;
import java.util.Scanner;

public class EmployeeReader {
    public static void readFullEmployeeList(){
       DisplayingUI.displayEmployeeListHeader();

        if(EmployeeManager.getNrOfEmployees()==0){
            DisplayingUI.displayNoEmployees();
        }
        else{
            for(int i=0;i<EmployeeManager.getNrOfEmployees();i++){
                DisplayingUI.displayEmployeeDetails(EmployeeManager.getEmployees()[i]);
            }
        }
    }

    public static void readByStringValue(String message,String[] stringArray){
        Scanner sc=new Scanner(System.in);
        System.out.println(message);
        String searchByValue=sc.nextLine();
        int index=0;
        for(String em: stringArray){
            if(searchByValue.equals(em)){

                DisplayingUI.displayEmployeeDetails(EmployeeManager.getEmployees()[index]);
                index++;
            }
        }
        if(index==0){
            System.out.println("No such employees were found. \nPress any key to continue.");
        }
        sc.nextLine();
    }

    //todo:  later implement search by other fields

}
