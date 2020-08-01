package com.pbilton.Object.oriented.Programming.Revision;

public class menuMain {

    public static void firstRun(){
        System.out.println("Welcome to Java Revision");
        System.out.println("This program is designed to allow the user to go over topics that have been taught");
        System.out.println("following the Java course provided by Code With Mosh, by Mosh Hamedani.");
        }

        public static int mainMenuSelect(){
            System.out.println("Please select one of the following:");
            System.out.println(" 1 - Java Fundamentals");
            System.out.println(" 2 - Java Intermediate");
            int value= userInput.numberPrompt("");
            return value;
        }
}
