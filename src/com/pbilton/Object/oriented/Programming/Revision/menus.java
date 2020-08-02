package com.pbilton.Object.oriented.Programming.Revision;

public class menus extends consoleInteraction {

    public void firstRun(){
       blank();
       System.out.println("Welcome to Java Revision");
       System.out.println("This program is designed to allow the user to go over topics that have been taught");
       System.out.println("following the Java course provided by Code With Mosh, by Mosh Hamedani.");
       blank();
    }

    public int mainMenuSelect(){
       System.out.println("Please select one of the following:");
       System.out.println(" 1 - Java Fundamentals");
       System.out.println(" 2 - Java Intermediate");
       int value= numberPrompt("Option: ");
       separator();
       return value;
    }

    public String re_run() {
        System.out.println();
        separator();
        System.out.println("Would you like to run through again?");
        String value = stringPrompt("Y or N").toLowerCase();
        blank();
        if (value.equals("y")) separator();
        return value;
    }
}
