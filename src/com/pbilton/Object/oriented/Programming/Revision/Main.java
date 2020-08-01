package com.pbilton.Object.oriented.Programming.Revision;

public class Main {

    public static void main(String[] args) {
        menuMain.firstRun();
        String runAgain = "";
        var intermediate = new intermediateSections();
        var fundamentals = new fundamentalSection();

        while (!runAgain.equals("n")) {
            int mainMenu = menuMain.mainMenuSelect();

            if (mainMenu == 1)
                fundamentals.sectionCommand();
            else
                intermediate.sectionCommand();

            runAgain=re_run();
        }
    }

    private static String re_run() {
        System.out.println();
        System.out.println("Would you like to run through again?");
        String value = userInput.stringPrompt("Y or N").toLowerCase();
        System.out.println();
        return value;
    }
}



