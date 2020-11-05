package com.step;

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
                case 2:     break;
                //todo:implement exit
            }

        }
    }
}
