package com.step.ui;

import java.util.Scanner;

public class ManagerUI {

    private static int levelUI = 0;
    final private static Scanner sc = new Scanner(System.in);

    public static int ManagementUI() {
        while (true) {
            switch (levelUI) {
                case 0: return MainMenu();
                case 1: return SearchEmployee();
                case 2: return  UpdateEmployee();
            }
        }
    }

    private static int MainMenu()  {
        DisplayUI.displayMainMenu();
        int option=sc.nextInt();
        DisplayUI.clearScreen();

        while(true){
            switch(option){
                case 1: return 1; //Create new employees
                case 2: levelUI=1; return 2; //Read employees
                case 3: levelUI=2; return 3; //Update employee data
                case 4: return 4; //Fire an employee
                case 5: return 5;
            }
        }
    }

    private static int SearchEmployee(){
        DisplayUI.displaySearchMenu();
        int option=sc.nextInt();
        DisplayUI.clearScreen();

        if(option==5){levelUI=0;}
        return option+10;
    }

    private static int UpdateEmployee(){
        DisplayUI.displayUpdateMenu();
        int option=sc.nextInt();
        DisplayUI.clearScreen();

        if(option==8){levelUI=0;}
        return 20+option;
    }
}
