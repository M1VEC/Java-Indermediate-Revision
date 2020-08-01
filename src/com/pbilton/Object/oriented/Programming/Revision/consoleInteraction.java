package com.pbilton.Object.oriented.Programming.Revision;

import java.util.Scanner;

public class consoleInteraction {
    static Scanner scanner = new Scanner(System.in);

    public static String stringPrompt(String prompt) {
        System.out.println(prompt);
        String value = scanner.next();
        return value;
    }

    public static int numberPrompt(String prompt){
        System.out.print(prompt);
        int value = scanner.nextInt();
        return value;
    }

    public static void blank(){
        System.out.println();
    }

    public static void separator(){
        System.out.println("---------------------------------------------------------------------------------");
    }
}
