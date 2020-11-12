package com.step.crud;

import com.step.data.Employees;

import java.time.LocalDate;
import java.util.Scanner;

import com.step.ui.DisplayingUI;

public class EmployeeUpdater {

    public static void updateStringValue(int index,String textPlaceHolder,int option){
        if(index<0)return;

        String oldValue = "not a valid value";
        switch(option){
            case 0: oldValue = EmployeeManager.getEmployees()[index].getName(); break;
            case 1: oldValue = EmployeeManager.getEmployees()[index].getSurname(); break;
            case 2: oldValue = EmployeeManager.getEmployees()[index].getIDNP(); break;
            case 3: oldValue = EmployeeManager.getEmployees()[index].getBirthDate().toString(); break;
            case 4: oldValue = EmployeeManager.getEmployees()[index].getEmployedOn().toString(); break;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Previous "+textPlaceHolder+" : "+oldValue);
        System.out.println("Set the new "+textPlaceHolder+":");
        String newStringValue=sc.nextLine();

        switch(option){
            case 0 : EmployeeManager.getEmployees()[index].setName(newStringValue); break;
            case 1 : EmployeeManager.getEmployees()[index].setSurname(newStringValue); break;
            case 2 : EmployeeManager.getEmployees()[index].setIDNP(newStringValue); break;
            case 3 : EmployeeManager.getEmployees()[index].setBirthDate(LocalDate.parse(newStringValue));break;
            case 4 : EmployeeManager.getEmployees()[index].setEmployedOn(LocalDate.parse(newStringValue));break;
        }
    }

    public static void updateFunction(int index){
        if(index<0)return;
        Scanner sc=new Scanner(System.in);
        int optionTemp;
        Employees.FunctionsEnum function = Employees.FunctionsEnum.valueOfInt(0);

        boolean availableFunc=false;

        while(!availableFunc){
            System.out.println("Previous function: "+EmployeeManager.getEmployees()[index].getFunction().toString());
            DisplayingUI.displayFunctionOptions("Available functions:\n");
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

    public static void updateSalary(int index){
        if(index<0)return;
        Scanner sc = new Scanner(System.in);
        double salary;
        while(true){
            System.out.println("Previous function: "+EmployeeManager.getEmployees()[index].getSalary());
            System.out.println("Enter the salary *(min:4000/max:12000)* :");
            salary=sc.nextDouble();
            if(salary>=4000&&salary<=12000)break;
            System.out.println("Invalid salary value. Try again.");
            sc.nextLine();
        }
        EmployeeManager.getEmployees()[index].setSalary(salary);
    }
}
