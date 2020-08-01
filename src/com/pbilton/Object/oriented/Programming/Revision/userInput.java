package com.pbilton.Object.oriented.Programming.Revision;

import java.util.Scanner;

public class userInput {
    static Scanner scanner = new Scanner(System.in);

    public static String stringPrompt(String prompt) {
        System.out.println(prompt);
        String value = scanner.next();
        return value;
    }

    public static int numberPrompt(String prompt){
        System.out.println(prompt);
        int value = scanner.nextInt();
        return value;
    }
}
