package com.step.crud;

import com.step.data.Employees;
import com.step.ui.DisplayingUI;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeInitializer {

    public static void registerNewEmployee(){
        Scanner sc=new Scanner(System.in);

        //region fields
        String name,surname,IDNP;
        LocalDate birthDate,employedOn;
        Employees.GenderEnum gender=Employees.GenderEnum.Male;//default values
        Employees.FunctionsEnum function=Employees.FunctionsEnum.valueOfInt(1);//default values
        double salary;
        int optionTemp;
        //endregion

        //region enter every field

        //region IDNP
        boolean foundMatch=false;
        do {
            System.out.println("Enter the IDNP:");
            IDNP = sc.nextLine();
            if(EmployeeManager.getNrOfEmployees()>0){
                for(int i=0;i<EmployeeManager.getNrOfEmployees();i++){
                    if (EmployeeManager.getEmployees()[i].getIDNP().equals(IDNP)) {
                        foundMatch = true;
                        System.out.println("This IDNP already exists.Any key to try again.");
                        sc.nextLine();
                        break;
                    }
                }
//            for (Employees em : EmployeeManager.getEmployees()) {             //can't use this type of for because we are using an array
//                if (em.getIDNP().equals(IDNP)) {
//                    foundMatch = true;
//                    System.out.println("This IDNP already exists.Any key to try again.");
//                    sc.nextLine();
//                    break;
//                }
//            }
            }

        } while (foundMatch);

        //endregion

        //region name
        System.out.println("Enter the name:");
        name=sc.nextLine();
        //endregion

        //region surname
        System.out.println("Enter the surname:");
        surname=sc.nextLine();
        //endregion

        //region birthdate
        System.out.println("Enter the birthdate (yyyy-mm-dd):");
        String date=sc.nextLine();
        birthDate=LocalDate.parse(date);
        //todo: see if the date format is ok
        //endregion

        //region employedOn
        employedOn=LocalDate.now();
        //endregion

        //region gender
        boolean availableGender=false;
        while(!availableGender){
            System.out.println("Enter the gender *(1- Male / 2- Female / 3-Custom)* :");
            optionTemp=sc.nextInt();
            switch(optionTemp){
                case 1: gender= Employees.GenderEnum.Male;availableGender=true;break;
                case 2: gender=Employees.GenderEnum.Female;availableGender=true;break;
                case 3:gender=Employees.GenderEnum.Custom;availableGender=true;break;
                default: System.out.println("Non-existent value.Try Again");sc.nextLine();break;
            }

        }
        //endregion

        //region salary
        while(true){
            System.out.println("Enter the salary *(min:4000/max:12000)* :");
            salary=sc.nextDouble();
            if(salary>=4000&&salary<=12000)break;
            System.out.println("Invalid salary value. Try again.");
            sc.nextLine();
        }

        //endregion

        //region function
        boolean availableFunc=false;
        while(!availableFunc){
            DisplayingUI.displayFunctionOptions("Enter the function");
            optionTemp=sc.nextInt();
            if(optionTemp>=1&&optionTemp<=6) {
                function = Employees.FunctionsEnum.valueOfInt(optionTemp);
                availableFunc=true;
            }
//            switch(optionTemp){
//                case 1: function= Employees.FunctionsEnum.SysEng;availableFunc=true;break;
//                case 2: function=Employees.FunctionsEnum.NetEng;availableFunc=true;break;
//                case 3: function=Employees.FunctionsEnum.SysAdmin;availableFunc=true;break;
//                case 4: function=Employees.FunctionsEnum.ProjMan;availableFunc=true;break;
//                case 5: function=Employees.FunctionsEnum.Helpdesk;availableFunc=true;break;
//                case 6: function=Employees.FunctionsEnum.DesktopSupport;availableFunc=true;break;
//            }
            if(!availableFunc){System.out.println("Non-existent value.Try Again");sc.nextLine();}
        }

        //endregion

        //endregion

        //region registration
        Employees empTemp=new Employees(IDNP,name,surname,employedOn,birthDate,gender,salary,function);
        EmployeeManager.addEmployee(empTemp);
        //endregion
    }
}
