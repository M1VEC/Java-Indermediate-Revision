package com.pbilton.Object.oriented.Programming.Revision;

public class menus {

    public static void firstRun(){
       System.out.println("Welcome to Java Revision");
       System.out.println("This program is designed to allow the user to go over topics that have been taught");
       System.out.println("following the Java course provided by Code With Mosh, by Mosh Hamedani.");
    }

    public static int mainMenuSelect(){
       System.out.println("Please select one of the following:");
       System.out.println(" 1 - Java Fundamentals");
       System.out.println(" 2 - Java Intermediate");
       int value= userInput.numberPrompt("Option: ");
       return value;
    }

    public static String re_run() {
        System.out.println();
        System.out.println("Would you like to run through again?");
        String value = userInput.stringPrompt("Y or N").toLowerCase();
        System.out.println();
        return value;
    }
}
