package com.step.ui;

import java.util.Scanner;

public class ManagerUI {

    private static int levelUI = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int ManagementUI() {
        while (true) {
            switch (levelUI) {
                case 0: return MainMenu();
            }
        }
    }

    public static int MainMenu()  {
        DisplayUI.displayMainMenu();
        int option=sc.nextInt();
        clearScreen();
        while(true){
            switch(option){
                case 1: return 1; //register new employees
                case 2: return 2; //View all the employees
                case 3: return 3; //Modify employee data
                case 4: return 4; //Fire an employee
            }
        }
    }
}
