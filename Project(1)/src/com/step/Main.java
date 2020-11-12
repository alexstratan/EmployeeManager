package com.step;

import com.step.crud.EmployeeManager;
import com.step.crud.EmployeeDeleter;
import com.step.crud.EmployeeReader;
import com.step.crud.EmployeeInitializer;
import com.step.ui.ManagerUI;
import com.step.crud.EmployeeUpdater;

public class Main {

    private static int backEnd;

    public static int getBackEnd(){
        return backEnd;
    }

    public static void setBackEnd(int _backEnd){
        backEnd=_backEnd;
    }

    public static void main(String[] args) {

        while(true){
            backEnd= ManagerUI.ManagementUI();
            switch (backEnd){
                case 1: EmployeeInitializer.registerNewEmployee();break;
                case 2: break;
                case 4: EmployeeDeleter.fireEmployee(EmployeeManager.getEmployeeIndex());break;
                case 11: EmployeeReader.readFullEmployeeList(); break;
                case 12: EmployeeReader.readByStringValue("Enter the name: ", EmployeeManager.getEmployeeNames());break;
                case 13: EmployeeReader.readByStringValue("Enter the surname: ", EmployeeManager.getEmployeeSurnames());break;
                case 14: EmployeeReader.readByStringValue("Enter the IDNP: ", EmployeeManager.getEmployeeIDNPs());break;
                case 21: EmployeeUpdater.updateStringValue(EmployeeManager.getEmployeeIndex(),"name",0);break;
                case 22: EmployeeUpdater.updateStringValue(EmployeeManager.getEmployeeIndex(),"surname",1);break;
                case 23: EmployeeUpdater.updateStringValue(EmployeeManager.getEmployeeIndex(),"IDNP",2);break;
                case 24: EmployeeUpdater.updateStringValue(EmployeeManager.getEmployeeIndex(),"birthdate",3);break;
                case 25: EmployeeUpdater.updateStringValue(EmployeeManager.getEmployeeIndex(),"employment date",4);break;
                case 26: EmployeeUpdater.updateSalary(EmployeeManager.getEmployeeIndex());break;
                case 27: EmployeeUpdater.updateFunction(EmployeeManager.getEmployeeIndex());break;
                case 5: Runtime.getRuntime().exit(0);
            }

        }
    }
}
