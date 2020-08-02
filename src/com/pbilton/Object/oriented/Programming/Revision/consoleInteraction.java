package com.pbilton.Object.oriented.Programming.Revision;

import java.util.Scanner;

public class consoleInteraction {
    static Scanner scanner = new Scanner(System.in);

    public String stringPrompt(String prompt) {
        System.out.println(prompt);
        String value = scanner.next();
        return value;
    }

    public int numberPrompt(String prompt){
        System.out.print(prompt);
        int value = scanner.nextInt();
        return value;
    }

    public static void blank(){
        System.out.println();
    }

    public void separator(){
        System.out.println("---------------------------------------------------------------------------------");
    }
}
