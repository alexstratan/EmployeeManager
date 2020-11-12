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
        DisplayingUI.displayMainMenu();
        int option=sc.nextInt();
        DisplayingUI.clearScreen();

        while(true){
            switch(option){
                case 1: return 1;
                case 2: levelUI=1; return 2;
                case 3: levelUI=2; return 3;
                case 4: levelUI=0; return 4;
                case 5: return 5;
            }
        }
    }

    private static int SearchEmployee(){
        DisplayingUI.displaySearchMenu();
        int option=sc.nextInt();
        DisplayingUI.clearScreen();

        if(option==5){levelUI=0;}
        return option+10;
    }

    private static int UpdateEmployee(){
        DisplayingUI.displayUpdateMenu();
        int option=sc.nextInt();
        DisplayingUI.clearScreen();

        if(option==8){levelUI=0;}
        return 20+option;
    }
}
