package com.pbilton.Object.oriented.Programming.Revision;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String runAgain = "";
        while (!runAgain.equals("n")) {
            int selectedSection = selectSection();
            var start = new intermediateSections();
            start.runSelection(selectedSection);
//            intermediateSections.runSelection(selectedSection);

            runAgain=re_run();
        }
    }

    private static int selectSection(){
        System.out.println("0- Tips, 1- Introduction, 2- Understanding Class, 3-Creating Classes, 4- Creating Objects");
        System.out.println("5- Memory Allocation, 6- Procedural Programming, 7- Encapsulation, 8- Setters and Getters");
        System.out.println("9- Abstraction, 10- Coupling, 11- Constructors, 12- Method Overloading, 13- Constructor Overloading");
        System.out.println("14- Refactoring, 15- Inheritance, 16- Access Modifiers, 17-Overriding Methods, 18- Upcasting and Downcasting,");
        System.out.println("19- Comparing Objects, 20- Polymorphism, 21- Abstract Classes and Methods, 22- Final Classes and Methods,");
        System.out.println("23 - Deep inheritance Hierarchies, 24 - Multiple Inheritance, 25 - Interfaces, 26 - Tightly Coupled Code,");
        System.out.println("27 - Creating interfaces, 28 - Dependency Injection, 29 - Constructor Injection, 30 - Setter Injection");
        System.out.println("31 - Method Injection, 32 - Interface Segregation Principle, 33 - Fields and Interfaces, ");
        System.out.println(" 34 - Static Methods and Interfaces, 35 - Private Methods and Interfaces, 36 - Difference between Interface and Abstract");
        System.out.print("Which section do you want to run?:");
        int value = scanner.nextInt();
        System.out.println();
        return value;
    }

    private static String re_run() {
        System.out.println();
        System.out.println("Would you like to run through again?");
        System.out.println("Y or N");
        String value = scanner.next().toLowerCase();
        System.out.println();
        return value;
    }
}



