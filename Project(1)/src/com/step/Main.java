package com.step;

import com.step.data.dataManager.EmployeeManager;
import com.step.readEmployees.ReadEmployees;
import com.step.register.RegisterEmployee;
import com.step.ui.ManagerUI;

public class Main {

    private static int backEnd;

    public static int getBackEnd(){
        return backEnd;
    }

    public static void main(String[] args) {

        while(true){
            backEnd= ManagerUI.ManagementUI();
            switch (backEnd){
                case 1: RegisterEmployee.registerNewEmployee();break;
                case 2: break;// no action here because next, we will open the menu
                case 11: ReadEmployees.readFullEmployeeList(); break;
                case 12: ReadEmployees.readByStringValue("Enter the name: ", EmployeeManager.getEmployeeNames());break;
                case 13: ReadEmployees.readByStringValue("Enter the surname: ", EmployeeManager.getEmployeeSurnames());break;
                case 14: ReadEmployees.readByStringValue("Enter the IDNP: ", EmployeeManager.getEmployeeIDNPs());break;
                case 5: Runtime.getRuntime().exit(0);
                //todo:implement exit
            }

        }
    }
}
