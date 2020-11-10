package com.step.update;

import com.step.data.Employees;

import java.time.LocalDate;
import java.util.Scanner;
import com.step.data.dataManager.EmployeeManager;
import com.step.ui.DisplayUI;

public class UpdateData {

    // updateStringValue
    // 0 - name
    // 1 - surname
    // 2 - IDNP
    // 3 - bDate
    // 4 - eDate

    public static void updateStringValue(int index,String property,String oldValue,int option){
        //oldValue e.g:   EmployeeManager.getEmployees()[index].getName()
        Scanner sc=new Scanner(System.in);
        System.out.println("Previous "+property+" : "+oldValue);
        System.out.println("Set the new "+property+":");
        String newStringValue=sc.nextLine();
        //can't use a single array for the cases below because we write in it, we do not read
        switch(option){
            case 0 : EmployeeManager.getEmployees()[index].setName(newStringValue); break;
            case 1 : EmployeeManager.getEmployees()[index].setSurname(newStringValue); break;
            case 2 : EmployeeManager.getEmployees()[index].setIDNP(newStringValue); break;
            case 3 : EmployeeManager.getEmployees()[index].setBirthDate(LocalDate.parse(newStringValue));
            case 4 : EmployeeManager.getEmployees()[index].setEmployedOn(LocalDate.parse(newStringValue));
        }
    }

    public static void updateFunction(int index){

        Scanner sc=new Scanner(System.in);
        int optionTemp;
        Employees.FunctionsEnum function = Employees.FunctionsEnum.valueOfInt(0); // default value

        boolean availableFunc=false;

        while(!availableFunc){
            System.out.println("Previous function: "+EmployeeManager.getEmployees()[index].getFunction().toString());
            DisplayUI.displayFunctionOptions("Available functions:\n");
            System.out.println("Set the new function:");
            optionTemp=sc.nextInt();
            if(optionTemp>=1&&optionTemp<=6) {
                function = Employees.FunctionsEnum.valueOfInt(optionTemp);
                availableFunc=true;
            }
            if(!availableFunc){System.out.println("Non-existent value.Try Again");sc.nextLine();}
        }
        EmployeeManager.getEmployees()[index].setFunction(function);
    }
}
