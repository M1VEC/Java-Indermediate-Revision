package com.pbilton.Object.oriented.Programming.Revision;

public class Main {

    public static void main(String[] args) {
        menus.firstRun();
        String runAgain = "";
        sectionInterface intermediate = new intermediateSections();
        sectionInterface fundamentals = new fundamentalSection();

        while (!runAgain.equals("n")) {
            int mainMenu = menus.mainMenuSelect();

            if (mainMenu == 1)
                fundamentals.sectionCommand();
            else
                intermediate.sectionCommand();

            runAgain= menus.re_run();
        }
    }
}



