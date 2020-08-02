package com.pbilton.Object.oriented.Programming.Revision;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class fundamentalSection extends consoleInteraction implements sectionInterface {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void sectionCommand() {
        int option = selectSection();
        runSelection(option);
    }

    @Override
    public int selectSection() {
        System.out.println();
        System.out.println("0- Tips, 1-Introduction, 2-Variable Revision, 3-Strings, 4-Arrays, 5- Constants, 6- Arithmetic Expressions,");
        System.out.println("7- Casting, 8- Maths, 9- Formatting Numbers, 10-Reading input, 11- Mortgage Calculator,");
        System.out.println("12- Comparision Operators, 13- Logical Operators, 14- If statements, 15- Ternary Operator,");
        System.out.println("16- Switch Statements, 17- FizzBuzz Exercise, 18- Loops, 19- Mortgage Calculator 2.0, 20- Creating Methods");
        System.out.println("21- Extracting Methods, 22- Refactoring Repetitive Patterns, 23- Mortgage Calculate 3.0");
        System.out.println("24- Errors, 25- Debugging, 26- Packaging Java Files");
        int value = numberPrompt("Which section do you want to run?:");
        separator();
        blank();
        return value;
    }

    @Override
    public void runSelection(int selectedSection) {
        if (selectedSection == 0) tips();
        else if (selectedSection == 1) Introduction();
        else if (selectedSection == 2) Variables();
        else if (selectedSection == 3) Strings();
        else if (selectedSection == 4) Arrays();
        else if (selectedSection == 5) Constants();
        else if (selectedSection == 6) Arithmetic_Expressions();
        else if (selectedSection == 7) Casting();
        else if (selectedSection == 8) Maths_class();
        else if (selectedSection == 9) Formatting_Numbers();
        else if (selectedSection == 10) Reading_input();
        else if (selectedSection == 11) Mortgage_Calculator();
        else if (selectedSection == 12) Comparision_Operators();
        else if (selectedSection == 13) Logical_Operators();
        else if (selectedSection == 14) If_Statements();
        else if (selectedSection == 15) Ternary_Operator();
        else if (selectedSection == 16) Switch_Statements();
        else if (selectedSection == 17) FizzBuzz_Exercise();
        else if (selectedSection == 18) Loops();
        else if (selectedSection == 19) Mortgage_Calculator_2();
        else if (selectedSection == 20) Creating_Methods();
        else if (selectedSection == 21) Extracting_methods();
        else if (selectedSection == 22) Refactoring_Repetitive_Patterns();
        else if (selectedSection == 23) Mortgage_Calculate_3();
        else if (selectedSection == 24) Errors();
        else if (selectedSection == 25) Debugging();
        else if (selectedSection == 26) Packaging_Java_Files();
    }

    private static void Packaging_Java_Files() {
        System.out.println("Packaging Java Files");
        System.out.println("    To package and deploy Command Line Java programs we need to follow these steps:");
        System.out.println("    1) Got to 'Project Structure' under the File command");
        System.out.println("    Select 'Artifacts");
        System.out.println("    Select 'jar' followed by modules with dependencies");
        System.out.println("    Select the main class, select ok to create the artifact");
        System.out.println("    Go to the build command and select build Artifacts");
        System.out.println("    This creates a jar file in the projects 'out' folder");
        System.out.println();
        System.out.println("How to run jar files");
        System.out.println("    To run jar files we need to make sure we have the latest JDK installed, and ");
        System.out.println("    the correct paths set");
        System.out.println("    Open up CMD prompt and using cd navigate to the dir that holds the jar file");
        System.out.println("    open the jar file by typing >java -jar \"revision workshop.jar\" were we use \"\" for files that have spaces");
        System.out.println("    Otherwise we can just use >java -jar vxv.jar");
    }

    private static void Debugging() {
        System.out.println("Debugging");
        System.out.println("    We can use toggle breakpoints in our code to add lines for the debugger to start at");
        System.out.println("    We then run the debugger. Within the debugger we can go through the code one line at a time");
        System.out.println("    Use step over to jump past loops and methods.");
        System.out.println("    Use the step in command to run through methods and loops");
        System.out.println("    Use the step out command to return to the parent call.");
    }

    private static void Errors() {
        System.out.println("Errors");
        System.out.println("    Types of errors");
        System.out.println("    Compile-time errors or syntax errors");
        System.out.println("    These prevent us from compiling our program. Often from not following Java syntax");
        System.out.println("    They are easy to find and fix as the ide will highlight the errors");
        System.out.println("    Use google or stackoverflow.com to help find solutions");
        System.out.println();

        System.out.println("Run time errors");
        System.out.println("    To find these errors we have to use a tool called 'Debugger'");
        System.out.println("    The debugger will go through the program line by line");
        System.out.println();

        System.out.println("Common Syntax errors:");
        System.out.println("    Specifying variable types and ; at the end of the line");
        System.out.println("    Calling a method but forget to add ()");
        System.out.println("    Forget to add \"\" when printing a string");
        System.out.println("    Misspell a variable or use incorrect case");
        System.out.println("    Using a single = when comparing variables instead of ==");
        System.out.println();
    }

    private static void Mortgage_Calculate_3() {
        System.out.println("Mortgage Calculate 3.0");
        System.out.println();
        System.out.println("    Finally the mortgage calculator is completed after the final code revision in which");
        System.out.println("    The code has been Refactored. This has been done by grouping sections of code that relate to");
        System.out.println("    to each into separate methods which cuts down our main method to a couple of lines.");
        System.out.println("    This is done by highlighting the code and pressing ctrl + alt + m");
        System.out.println();

        System.out.println("  public class Main {");
        System.out.println("    final static short MONTHS_IN_YEAR = 12;");
        System.out.println("    final static byte PERCENT = 100;");
        System.out.println("  public static void main(String[] args) {");
        System.out.println("    int principle = (int) readNumber(\"Principle: \",1000,1_000_000);");
        System.out.println("    float annualInterest = (float) readNumber(\"Annual Interest Rate: \", 1, 30);");
        System.out.println("    short years = (short) readNumber(\"Period: \", 1, 30);");
        System.out.println("    short numberOfPayments = payments(years);");
        System.out.println("    float monthlyInterest = interest(annualInterest);");
        System.out.println("    System.out.println();");
        System.out.println();

        System.out.println("  printMortgage(principle, numberOfPayments, monthlyInterest);");
        System.out.println();

        System.out.println("  printPaymentSchedule(principle, numberOfPayments, monthlyInterest);");
        System.out.println("  }");
        System.out.println();

        System.out.println("  private static void printMortgage(int principle, short numberOfPayments, float monthlyInterest) {");
        System.out.println("  double mortgage = calculateMortgage(principle, monthlyInterest, numberOfPayments);");
        System.out.println("    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);");
        System.out.println("    System.out.println(\"Mortgage\");");
        System.out.println("    System.out.println(\"------------------\");");
        System.out.println("    System.out.println(\"Monthly Payments: \" + mortgageFormatted);");
        System.out.println("    System.out.println();");
        System.out.println("  }");
        System.out.println();

        System.out.println("  private static void printPaymentSchedule(int principle, short numberOfPayments, float monthlyInterest) {");
        System.out.println("    System.out.println(\"Payment Schedule\");");
        System.out.println("    System.out.println(\"-----------------\");");
        System.out.println("    System.out.println(\"Month | Payment\");");
        System.out.println("  paymentSchedule(numberOfPayments,monthlyInterest,principle);");
        System.out.println("  }");
        System.out.println();

        System.out.println("  public static void paymentSchedule (short numberOfPayments, float monthlyInterest, int principle){");
        System.out.println("    for (int paymentsMade = 1; paymentsMade <= numberOfPayments; paymentsMade++){");
        System.out.println("        double monthlyPayments = principle * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, paymentsMade))");
        System.out.println("        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);");
        System.out.println("        String paymentsFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayments);");
        System.out.println("        System.out.println(paymentsMade + \")     \" + paymentsFormatted);");
        System.out.println("    }");
        System.out.println("  }");
        System.out.println();

        System.out.println("  public static short payments(short years){");
        System.out.println("    return (short)(years * MONTHS_IN_YEAR);");
        System.out.println("  }");
        System.out.println();

        System.out.println("  public static float interest(float annualInterest){");
        System.out.println("    return ((annualInterest / PERCENT) / MONTHS_IN_YEAR);");
        System.out.println("  }");
        System.out.println();

        System.out.println("  public static double readNumber(String prompt, double min, double max){");
        System.out.println("    Scanner scanner = new Scanner(System.in);");
        System.out.println("    double value;");
        System.out.println("    while (true) {");
        System.out.println("        System.out.print(prompt);");
        System.out.println("            value = scanner.nextFloat();");
        System.out.println("    if (value >= min && value <= max)");
        System.out.println("    break;");
        System.out.println("        System.out.println(\"Enter a value between \" + min + \" and \" + max);");
        System.out.println("    }");
        System.out.println("    return value;");
        System.out.println("  }");
        System.out.println();

        System.out.println("  public static double calculateMortgage(int principle,");
        System.out.println("    float monthlyInterest,");
        System.out.println("    short numberOfPayments){");
        System.out.println();

        System.out.println("    return principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))");
        System.out.println("        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);");
        System.out.println("    }");
        System.out.println("  }");
    }

    private static void Refactoring_Repetitive_Patterns() {
        System.out.println("Refactoring Repetitive Patterns");
        System.out.println();
        System.out.println("    If we have repetitive code, we can place that in a single method that can then be called multiple");
        System.out.println("    times");
        System.out.println("    In the example below, we call readNumber method and pass three variables");
        System.out.println("    In return the variable on the left gets initialised");
        System.out.println();

        System.out.println("int principle = (int) readNumber(\"Principle: \",1000,1_000_000);");
        System.out.println("float annualInterest = (float) readNumber(\"Annual Interest Rate: \", 1, 30);");
        System.out.println("byte years = (byte) readNumber(\"Period: \", 1, 30);");
        System.out.println();

        System.out.println("    The following is the method readNumber that gets called, when we call the method we");
        System.out.println("    pass variables that populate prompt, min and max");
        System.out.println();

        System.out.println("public static double readNumber(String prompt, double min, double max){");
        System.out.println("   Scanner scanner = new Scanner(System.in);");
        System.out.println("   double value;");
        System.out.println("    while (true) {");
        System.out.println("       System.out.print(prompt);");
        System.out.println("       value = scanner.nextFloat();");
        System.out.println("    if (value >= min && value <= max)");
        System.out.println("      break;");
        System.out.println("       System.out.println(\"Enter a value between\" + min + \"and\" + max);");
        System.out.println("    }");
        System.out.println("   return value;");
        System.out.println("}");
    }

    private static void Extracting_methods() {
        System.out.println("Extracting Methods");
        System.out.println();

        System.out.println("    To clean up code, we put sections into methods. When creating a method,");
        System.out.println("    we need to pass any variables that are needed, along with thier type");
        System.out.println("    When we call the method, we need to include the variables we are sending");
        System.out.println("    Whatever we work out in the method, we can return it using the return statement");
        System.out.println();

        System.out.println("double mortgage = calculateMortgage(principle, annualInterest, years);");
        System.out.println("    This statement calls the method calculateMortgage, in brackets is the variables that we are sending");
        System.out.println();

        System.out.println("public static double calculateMortgage(int principle, float annualInterest, byte years){");
        System.out.println(" final byte MONTHS_IN_YEAR = 12;");
        System.out.println(" final byte PERCENT = 100;");
        System.out.println();

        System.out.println(" float monthlyInterest = ((annualInterest / 100) / 12);");
        System.out.println(" short numberOfPayments = (short)(years * MONTHS_IN_YEAR);");
        System.out.println();
        System.out.println(" double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))");
        System.out.println("/(Math.pow(1 + monthlyInterest, numberOfPayments) - 1);");
        System.out.println();

        System.out.println(" return mortgage;");
        System.out.println("}");
    }

    private static void Creating_Methods() {
        System.out.println("Creating Methods");
        System.out.println();
        System.out.println("    A Class is a container for related functions");
        System.out.println("    Method is a function that is a part of a Class");
        System.out.println("    In Java each Class should have an access modifier");

        System.out.println("public static void main(String[] args) {");
        System.out.println("   String message = greetUser(\" phil\", \"Bilton\");");
        System.out.println("   System.out.println(message);");
        System.out.println("}");
        System.out.println();

        System.out.println("Following is a method:");
        System.out.println("public static void greetUser(String firstName, String lastName){");
        System.out.println("  System.out.println(\"Hello\" + firstName + \" \" + lastName);");
        System.out.println("}");
        System.out.println();
        System.out.println("    public:     access modifier, the method can be called from outside the class");
        System.out.println("    static:     belongs to a class as opposed to an object");
        System.out.println("    void:       if the method returns a value then we can write int etc instead of void");
        System.out.println("    greetUser:  name of the method.");
        System.out.println("    (String name){The variable becomes a local variable within the method");
        System.out.println("    The Strings firstName and lastName are available from the main method");
        System.out.println("    and used within the greetUser method without having to be initialised");

        System.out.println("The above can be simplified by:");
        System.out.println("public static String greetUser(String firstName, String lastName) {");
        System.out.println("  return  \"Hello \" + firstName + \" \" + lastName;");
        System.out.println("}");
        System.out.println();
        System.out.println("    void is changed to String and the print command is changed to return");
        System.out.println("    From the main method, greetUser is called and firstName and lastName is sent");
        System.out.println("    Within greetUser, firstName and lastName is used as local variables and returns a message");
        System.out.println("    to the main method it was called from. This is then saved in String message");
    }

    private static void Mortgage_Calculator_2() {
        System.out.println("Mortgage Calculator 2.0");
        System.out.println("Error handling");

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principle = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Principle (£1k - £1M):");
            principle = scanner.nextInt();
            if (principle >= 100_0 && principle <= 1_000_000)
                break;
            System.out.println("Enter a value between £1000 and £1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate:");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = (float) ((annualInterest / 100) / 12);
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period:");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Please enter a value between 1 and 30 years");
            System.out.print("Period:");
        }

        double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        //----Mortgage example printed out-----
        System.out.println("    final byte MONTHS_IN_YEAR = 12;");
        System.out.println("    final byte PERCENT = 100;");

        System.out.println("    int principle = 0;");
        System.out.println("    float monthlyInterest = 0;");
        System.out.println("    int numberOfPayments = 0;");

        System.out.println("    while (true) {");
        System.out.println("        System.out.print(\"Principle (£1k - £1M):\");");
        System.out.println("        principle = scanner.nextInt();");
        System.out.println("    if (principle >= 100_0 && principle <= 1_000_000)");
        System.out.println("    break;");
        System.out.println("        System.out.println(\"Enter a value between £1000 and £1,000,000\");");
        System.out.println("    }");

        System.out.println("    while (true) {");
        System.out.println("        System.out.print(\"Annual Interest Rate:\");");
        System.out.println("        float annualInterest = scanner.nextFloat();");
        System.out.println("    if (annualInterest >= 1 && annualInterest <= 30) {");
        System.out.println("        monthlyInterest = (float) ((annualInterest / 100) / 12);");
        System.out.println("    break;");
        System.out.println("    }");
        System.out.println("        System.out.println(\"Enter a value greater than 0 and less than or equal to 30\");");
        System.out.println("    }");

        System.out.println("    while (true) {");
        System.out.println("        System.out.print(\"Period:\");");
        System.out.println("        byte years = scanner.nextByte();");
        System.out.println("    if (years >= 1 && years <= 30){");
        System.out.println("        numberOfPayments = years * MONTHS_IN_YEAR;");
        System.out.println("    break;");
        System.out.println("    }");
        System.out.println("        System.out.println(\"Please enter a value between 1 and 30 years\");");
        System.out.println("        System.out.print(\"Period:\");");
        System.out.println("    }");

        System.out.println("    double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))");
        System.out.println("    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);");

        System.out.println("    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);");
        System.out.println("    System.out.println(\"Mortgage: \" + mortgageFormatted);");
    }

    private static void Loops() {
        System.out.println("Loops");
        System.out.println("    For Loops");
        System.out.println("for (int i = 1; i <= 5; i++)");
        System.out.println("    The for loop is made up of three parts:");
        System.out.println("    1) for (int i = 1;   This initialises i to 1 followed by ;");
        System.out.println("    2) i <= 5;  This evaluates if i is smaller than or equal to 5. If so, it will execute " +
                "the code block ");
        System.out.println("    3) i++) This is what happens once the code block is executed, in this case it will add 1 to i");
        System.out.println("    We have to use {} with for loops if we are carrying out more than one statement");
        System.out.println();

        System.out.println("    While Loops");
        System.out.println("int i = 10;");
        System.out.println("while (i > 0 ){");        System.out.println("We can also simplify the above while statement by using:");

        System.out.println("System.out.println(\"Hello world \" + i);");
        System.out.println("i--;");
        System.out.println();

        System.out.println("    while loops are better to use in situations where we don't know how many\n" +
                "times we want to run the loop");
        System.out.println("    While loops are useful when we want the loop to continue until the user \"quits\" e.g");
        System.out.println("String input = \"\";");
        System.out.println("while(!input.equals(\"quit\")) {");
        System.out.println(" System.out.println(\"Input:\");");
        System.out.println(" input = scanner.next().toLowerCase();");
        System.out.println(" System.out.println(input);");
        System.out.println("}");
        System.out.println("    This loop will continue whilst input does not equal quit");
        System.out.println();

        System.out.println("Break and Continue Statement");
        System.out.println("    Break statements can be used to finish the loop without finishing the rest of the code block");
        System.out.println("    Continue Statement can be used to return the loop back to the top");
        System.out.println("    while (true) {");
        System.out.println("    If you use while(true) you NEED a break statement otherwise the loop will never finish");
        System.out.println();
        System.out.println("String input = \"\";");
        System.out.println("while (true){");
        System.out.println("  System.out.println(\"Input\");");
        System.out.println("  input = scanner.next().toLowerCase();");
        System.out.println("  if (input.equals(\"pass\"))");
        System.out.println("    continue;");
        System.out.println("  if (input.equals(\"quit\"))");
        System.out.println("    break;");
        System.out.println("  System.out.println(input);");
        System.out.println("}");
        System.out.println();

        System.out.println("Do While Loops");
        System.out.println("    Will execute at least once because the condition is at the end of the loop");
        System.out.println("String input=\"\";");
        System.out.println("do {");
        System.out.println("  System.out.print(\"Input:\");");
        System.out.println("  input = scanner.next().toLowerCase();");
        System.out.println("  System.out.println(input);");
        System.out.println("}  while (!input.equals(\"quit\"));");
        System.out.println();

        System.out.println("For Each Loops");
        System.out.println("    Can simplify For loops, but with restrictions:");
        System.out.println("    For Each Loops is always forward only, they can't go in reverse");
        System.out.println("    You don't have access to the index of each item");
        System.out.println();

        String[] fruits = {"apples","mango","orange"};
        System.out.println("For Loop");
        System.out.println("for (int i = 0; i < fruits.length; i++)");
        System.out.println("System.out.println(fruits[i]);");
        System.out.println();
        System.out.println("For Each Loop");
        System.out.println("for (String fruit : fruits)");
        System.out.println("System.out.println(fruit);");
        System.out.println();
        System.out.println("    In a For Each Loop, there is no index and no condition. The");
        System.out.println("    String fruit on each iteration will become the indexed fruits");
        System.out.println();
    }

    private static void FizzBuzz_Exercise() {
        System.out.println("FizzBuzz Exercise");
        System.out.println("    int fizz = 5;");
        System.out.println("    int Buzz = 3;");
        System.out.println("    String play = \"\";");
        System.out.println();
        System.out.println("    Scanner scanner = new Scanner(System.in);");
        System.out.println("    while (!play.equals(\"n\")) {");
        System.out.println("    System.out.print(\"Please enter a number: \");");
        System.out.println("    int numberEntered = scanner.nextInt();");
        System.out.println();
        System.out.println("    if ((numberEntered % fizz == 0) && (numberEntered % buzz == 0))");
        System.out.println("        System.out.println(\"    fizzbuzz\");");
        System.out.println("    else if (numberEntered % fizz == 0)");
        System.out.println("        System.out.println(\"    fizz\");");
        System.out.println("    else if (numberEntered % buzz == 0)");
        System.out.println("        System.out.println(\"    buzz\");");
        System.out.println("    else");
        System.out.println("        System.out.println(\"    \" + numberEntered);");
        System.out.println();
        System.out.println("    System.out.println(\"Would you like to play again?\");");
        System.out.println("    System.out.println(\"Y or N\");");
        System.out.println("    play = scanner.next().toLowerCase();");
        System.out.println("    }");
        System.out.println();

        int fizz = 5;
        int buzz = 3;
        String play = "";
        while (!play.equals("n")) {
            System.out.print("Please enter a number: ");
            int numberEntered = scanner.nextInt();
            if ((numberEntered % fizz == 0) && (numberEntered % buzz == 0))
                System.out.println("    fizzbuzz");
            else if (numberEntered % fizz == 0)
                System.out.println("    fizz");
            else if (numberEntered % buzz == 0)
                System.out.println("    buzz");
            else
                System.out.println("    " + numberEntered);
            System.out.println("Would you like to play again?");
            System.out.println("Y or N");
            play = scanner.next().toLowerCase();
        }
    }

    private static void Switch_Statements() {
        System.out.println("Switch Statements");
        System.out.println("    Switch statements executes different parts of code depending");
        System.out.println("    on a value of an expression");
        System.out.println();

        System.out.println("String role = \"admin\";");
        System.out.println(" switch (role) {");
        System.out.println("  case \"admin\":");
        System.out.println("    System.out.println(\"You're an admin\");");
        System.out.println("  break;");
        System.out.println();
        System.out.println("  case \"moderator\":");
        System.out.println("    System.out.println(\"You're a moderator\");");
        System.out.println("  break;");
        System.out.println();
        System.out.println(" default:");
        System.out.println("    System.out.println(\"You're a guest\");");
        System.out.println();

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
        System.out.println();
        System.out.println("Start with switch followed by the variable name in () and then {");
        System.out.println("Case acts like an 'if' ");
        System.out.println("Each case needs a break statement otherwise Java will continue with");
        System.out.println("The rest of the switch statement");
        System.out.println("Default is used for when no condition is met");
        System.out.println("End the switch statement with }");
        System.out.println("Switch statements can be used with all primitive variables");
    }

    private static void Ternary_Operator() {
        System.out.println("Ternary Operator");
        System.out.println("    The Ternary Operator is a clean way to assign a variable based on a condition");
        System.out.println("    It is made up of three parts, the condition (?) and two values separated by (:)");
        System.out.println("    condition ? value1 : value2");
        System.out.println("");
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println("int income = 120_000;");
        System.out.println("String className = income > 100_000 ? \"First\" : \"Economy\";");
        System.out.println("    " + className);
    }

    private static void If_Statements() {
        System.out.println("If Statements");
        System.out.println("    If statements are important to build programs that makes decisions based " +
                "on certain conditions");
        System.out.println("The following is a basic If statement");
        System.out.println();

        System.out.println("int temperature = 32;");
        System.out.println("if(temperature > 30) {");
        System.out.println("  System.out.println(\"Its a hot day\");");
        System.out.println("  System.out.println(\"Drink water\");");
        System.out.println("}");
        System.out.println("else if (temperature > 20 && temperature <= 30)");
        System.out.println("  System.out.println(\"Its a nice day\");");
        System.out.println("else");
        System.out.println("  System.out.println(\"It's a cold day\");");

        System.out.println();
        System.out.println("    The curly braces after an if statement allows for a block of code to " +
                "run if that condition is met");
        System.out.println("    {} Braces only required if we have multiple statements within that IF condition");
        System.out.println();

        // Simplifying If Statements
        System.out.println("Simplifying If Statements");
        System.out.println("    The If statement can be simplified to make our code more readable and cleaner");
        System.out.println("    Any variables initialised inside an if statement cant be accessed outside that code block");
        System.out.println("    Instead we initialise it before the if statement");
        System.out.println("Original IF Statement:");
        System.out.println();

        System.out.println("int income = 120_000;");
        System.out.println("boolean hasHighIncome = false;");
        System.out.println("if(income > 100_000)");
        System.out.println("  hasHighIncome = true;");
        System.out.println("else");
        System.out.println("  hasHighIncome = false;");
        System.out.println();

        System.out.println("    The above if statement could be simplified by using the boolean as the IF");
        System.out.println();

        System.out.println("int income = 120_000;");
        System.out.println("boolean hasHighIncome = (income > 100_000);");
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println("    " + hasHighIncome);
        System.out.println("    No need for an IF statement as the boolean can only return true or false");
    }

    private static void Logical_Operators() {
        System.out.println("Logical Operators");
        System.out.println("    Logical operators can be used to combine multiple boolean expressions");
        System.out.println("    && is the AND operator. It checks if 1st value is true and the following value is also true");
        System.out.println("    || is the OR operator. It checks if the 1st value is true OR the following value is true ");
        System.out.println("    ! When using logical operators you can use a ! before the variable to reverse it, i.e value is not true");
        System.out.println();

        System.out.println("int temperature = 23;");
        System.out.println("boolean isWarm = temperature > 20 && temperature < 30;");
        int temperature =22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("    " + isWarm);
        System.out.println("    This checks the temperature is above 20 AND below 30 ");
        System.out.println();

        System.out.println("boolean hasHighIncome =true;");
        System.out.println("boolean hasGoodCredit = true;");
        System.out.println("boolean hasCriminalRecord = true;");
        System.out.println("boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;");
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = true;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println("    " + isEligible);
        System.out.println("    This checks that hasHighIncome is true, if not it checks that hasGoodCredit is true and then it checks " +
                "if hasCriminalRecord is false using the ! before the variable");
    }

    private static void Comparision_Operators() {
        System.out.println("Comparision Operators");
        System.out.println();

        System.out.println("    The following operators are used to compare two primitive values against each other");
        System.out.println("    ==     values match");
        System.out.println("    !=     values don't match");
        System.out.println("    >      Greater than");
        System.out.println("    >=     Greater than or equals to");
        System.out.println("    <      Less than");
        System.out.println("    <=     Less than or equals to");
        System.out.println();
        int x = 1;
        int y = 3;
        System.out.println("int x = 1;");
        System.out.println("int y = 3;");
        System.out.println("System.out.println(x == y);");
        System.out.println(     x == y);
        System.out.println("Checks if x and y values match");
        System.out.println();

        System.out.println("System.out.println(x != y);");
        System.out.println(     x != y);
        System.out.println("Checks if x and y are different");
        System.out.println();

        System.out.println("System.out.println(x > y);");
        System.out.println(x > y);
        System.out.println("Checks if x is greater than y");
        System.out.println();

        System.out.println("System.out.println(x <= y);");
        System.out.println(x <= y);
        System.out.println("Checks if x is less than or equals to y");
    }

    private static void Mortgage_Calculator() {
        System.out.println("Mortgage Calculator");

        System.out.print("Principle:");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        double annual = scanner.nextDouble();
        double monthly = (annual / 100) / 12;

        System.out.print("Period:");
        int years = scanner.nextInt();
        int months = years * 12;

        double mortgage = principle * (monthly * Math.pow(1 + monthly, months))
                / (Math.pow(1 + monthly, months) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        //----Mortgage example printed out-----
        System.out.println();
        System.out.println("    System.out.print(\"Principle:\");");
        System.out.println("    int principle = scanner.nextInt();");
        System.out.println("Gets the total needed to borrow");
        System.out.println();

        System.out.println("    System.out.print(\"Annual Interest Rate:\");");
        System.out.println("    double annual = scanner.nextDouble();");
        System.out.println("    double monthly = (annual / 100) / 12;");
        System.out.println("Gets the yearly interest rate, divides by 100 and " +
                "then divided by 12 months to get per month");
        System.out.println();

        System.out.println("    System.out.print(\"Period:\");");
        System.out.println("    int years = scanner.nextInt();");
        System.out.println("    int months = years * 12;");
        System.out.println("Gets the amount of years to pay back the loan");
        System.out.println();

        System.out.println("    double mortgage = principle * (monthly * Math.pow(1 + monthly, months))");
        System.out.println("    / (Math.pow(1 + monthly, months) - 1);");
        System.out.println("Uses the standard mortgage formula that works out how much " +
                "to repay each month");
        System.out.println();

        System.out.println("    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);");
        System.out.println("    System.out.println(\"Mortgage: \" + mortgageFormatted);");
        System.out.println("Formats the variable mortgage into a currency format and " +
                "saves it in mortgageFormatted");
    }

    private static void Reading_input() {
        System.out.println("Reading input");

        System.out.println("Scanner name = new Scanner(System.in);");
        System.out.println("System.out.print(\"How old are you?:\");");
        System.out.println("byte age = name.nextByte();");
        System.out.println("System.out.println(\"You are \" + age);");
        System.out.println();

        System.out.println("    Scanner used for user input. New scanner only is needed once, after use the following:");
        System.out.println("int age = scanner.nextByte();");
        System.out.println();

        System.out.println("Scanner scanner = new Scanner(System.in);");
        System.out.println("System.out.print(\"Please tell me your name:\");");
        System.out.println("String name = scanner.nextLine();");
        System.out.println("System.out.println(\"Hello \" + name);");
        System.out.println("System.out.print(\"How old are you \" + name + \"?:\");");
        System.out.println("Byte age = scanner.nextByte();");
        System.out.println("System.out.println(name + \" you are \" + age + \" years old?\");");
        System.out.println();

        System.out.println("String name = scanner.nextLine().trim();");
        System.out.println("    trim dot operator will trim blank spaces");
    }

    private static void Formatting_Numbers() {
        System.out.println("Formatting Numbers");

        NumberFormat cash = NumberFormat.getCurrencyInstance();
        String cashTotal = cash.format(2341324);
        System.out.println("NumberFormat cash = NumberFormat.getCurrencyInstance();");
        System.out.println("String cashTotal = cash.format(2341324);");
        System.out.println("System.out.println(cashTotal);");
        System.out.println("    Above turns cash var into a currency format: £2,341,324");
        System.out.println();

        NumberFormat perc = NumberFormat.getPercentInstance();
        String howMuch = perc.format(0.45);
        System.out.println("NumberFormat perc = NumberFormat.getPercentInstance();");
        System.out.println("String howMuch = perc.format(0.45);");
        System.out.println("System.out.println(howMuch);");
        System.out.println("    Above turns perc into a percentage format: 45%");
        System.out.println();

        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println("String result = NumberFormat.getPercentInstance().format(0.1);");
        System.out.println("System.out.println(result);");
        System.out.println("    Above is the same as above example, but is called chain formatting");
        System.out.println();

        System.out.println("    Use NumberFormat with the dot operator to access " +
                "different formatting methods");
        System.out.println();


        System.out.println("***Tip***");
        System.out.println("    To change all instances of a variable name, highlight word and right click.");
        System.out.println("    Select Refactor and then Rename. Shortcut is Shift+F6");
    }

    private static void Maths_class() {
        System.out.println("Maths class");

        int result = Math.round(1.1F);
        int resultCeil = (int)Math.ceil(1.1F);
        System.out.println("int result = Math.round(1.1F);");
        System.out.println("int result = (int)Math.ceil(1.1F);");
        System.out.println("    Above example returns the ceiling of 1.1, which is 2. But it tries to return a double.");
        System.out.println("    It needs to be explicitly casted as int.");
        System.out.println();

        int resultFloor = (int)Math.floor(1.1F);
        System.out.println("int result = (int)Math.floor(1.1F);");
        System.out.println("    Above returns the whole number below 1.1 becomes 1");
        System.out.println();

        int resultMax = Math.max(3, 10);
        System.out.println("int result = Math.max(3, 10);");
        System.out.println("    Returns the largest number");
        System.out.println();

        double resultRandom = Math.random();
        System.out.println("double result = Math.random();");
        System.out.println("    Returns a number between 0 and 1");
        System.out.println();

        System.out.println("int result = (int) (Math.random()*100);");
        System.out.println("    Cast as int and wrap Math.random()*100 with ()");
        int resultRandomLarge = (int) (Math.random()*100);

        System.out.println("int number = 15;");
        System.out.println("if(number % 5 == 0)");
        System.out.println("     % Modulus operator returns the remainder of a division");
        int number = 15;
        if(number % 5 == 0);
    }

    private static void Casting() {
        System.out.println("Casting");

        System.out.println("short x = 1;");
        System.out.println("int y = x + 2;");
        System.out.println("    In the background java will copy short x to a unknown int then add 2 this is Implicit casting");
        System.out.println("    Implicit casting is Java casting in the background automatically");
        System.out.println();

        System.out.println("double x = 1.1;");
        System.out.println("double y = x + 2;");
        System.out.println("    The value of 2 will be casted to a double, then added to x");
        System.out.println("    byte > short > int > long > float > double");
        System.out.println();

        System.out.println("double x = 1.1;");
        System.out.println("int y = (int)x + 2;");
        System.out.println("    Explicit Casting. Forces the double to a int. Only works when compatible");
        System.out.println();

        System.out.println("String x = \"4\";");
        System.out.println("int y = Integer.parseInt(x) + 2;");
        System.out.println("System.out.println(y);");
        System.out.println("    Above example changes a string to a integer. This is important when building a user interface");
        System.out.println("    as the users input is as a string.");
    }

    private static void Arithmetic_Expressions() {
        System.out.println("Arithmetic Expressions");
        System.out.println("double result = (double)10 / (double)3;");
        System.out.println("System.out.println(result);");
        System.out.println("    Use the double expression when dividing to get the remainder");
        System.out.println();

        System.out.println("int x = 1;");
        System.out.println("x++;");
        System.out.println("System.out.println(x);");
        System.out.println("    Use ++ or -- expressions to add or subtract a variable by 1");
        System.out.println();

        System.out.println("int x = 1;");
        System.out.println("int y = x++;");
        System.out.println("    This will cause y to become 1 and x to become 2 since ++ was added after x");
        System.out.println();

        System.out.println("int x = 1;");
        System.out.println("int y = ++x;");
        System.out.println("    This will cause y to become 2 and x to become 2 since ++ was added before x");
        System.out.println("    To increment by more than 1");
        System.out.println("x += 2");
        System.out.println();

        System.out.println("    Order of operations is () then */ then +-");
    }

    private static void Constants() {
        System.out.println("Constants");
        final float PI = 3.14F;
        System.out.println("final float PI = 3.14F;");
        System.out.println("    Use the word final to lock the variable. Where possible use CAPITALS for the variable name");
    }

    private static void Arrays() {
        System.out.println("Arrays");
        System.out.println("    The following is a old way of initializing an array if values are already known");
        System.out.println("int[] numbers = new int[5];");
        System.out.println("numbers[0] = 1;");
        System.out.println("numbers[1] = 2;");
        System.out.println("numbers[2] = 3;");
        System.out.println("System.out.println(Arrays.toString(numbers));");
        System.out.println("    Use Arrays.toString(numbers) before printing otherwise java will print the array memory location");

        System.out.println("    New way of initializing an array if contents already known using curly brackets");
        System.out.println("int[] number = {1,2,3,4,5};");
        System.out.println("System.out.println(number.length);");
        System.out.println("    number.length operator will print the length of the array");

        System.out.println();
        System.out.println("Multi-dimensional arrays");
        System.out.println("int [] [] numbers = new int [2] [3];");
        System.out.println("numbers[0][0] = 4;");
        System.out.println("numbers[1][1] = 6;");

        System.out.println("    This creates a 2 dimensional array with 3 columns");
        System.out.println("    1st number in the 1st array will be 4");
        System.out.println("    2nd number in the 2nd array will be 6");

        System.out.println("System.out.println(Arrays.deepToString(numbers));");
        System.out.println("    Use the above Arrays.deepToString command to print the array");

        System.out.println();
        System.out.println("    If the contents of the array is already known you can use:");
        System.out.println("int [][] numbers = { {1,2,3} , {4,5,6}};");
    }

    private static void Strings() {
        System.out.println("Strings");
        String message = "Hello phil !!";
        System.out.println(message.endsWith("!!"));
        System.out.println("String message = \"Hello phil !!\";");
        System.out.println("System.out.println(message.endsWith(\"!!\"));");
        System.out.println("    Prints true after checking if message ends with !!");
        System.out.println("    Use dot operator to check or manipulate the string before print. Does not change original string");
        System.out.println("    Use \\ as escape sequence which can also be used to add new lines, tabs etc to strings");
    }

    private static void Variables() {
        System.out.println("Primitive variables revision");

        byte herAge = 31;
        System.out.println("byte herAge = 31;");
        System.out.println("    Byte can store -128 to 127 bytes");
        System.out.println();

        short little = 123;
        System.out.println("short little = 123;");
        System.out.println("    Short can store -32k to 32k");
        System.out.println();

        int viewCounts = 123_456_789;
        System.out.println("int viewCounts = 123_456_789;");
        System.out.println("    Int can store -2b to 2b. Use Underscore after every 3 numbers");
        System.out.println();

        long viewLarge = 3_123_456_789L;
        System.out.println("long viewLarge = 3_123_456_789L;");
        System.out.println("    Long can store large numbers but use L at the end");
        System.out.println();

        float price = 10.99F;
        System.out.println("float price = 10.99F;");
        System.out.println("    Float can store decimal but use F at the end");
        System.out.println();

        double cost = 15_876.99;
        System.out.println("double cost = 15_876.99;");
        System.out.println("    Double same as float but for larger numbers");
        System.out.println();

        char letter = 'A';
        System.out.println("char letter = 'A';");
        System.out.println("    Char store only one character. use ' ' around single characters and \" \" around strings");
        System.out.println();

        String message = "Hello, welcome to java";
        System.out.println("String message = \"Hello\";");
        System.out.println("    String can store unlimited characters. Wrap \" \" around strings");
        System.out.println();

        boolean isEligable = true;
        System.out.println("boolean isEligable = true;");
        System.out.println("    Boolean is like yes or no and prints either 'true' or 'false' ");
        System.out.println();

        System.out.println("    Type sout for print shortcut");
        System.out.println("    If you want user input on the same line as a question for example, " +
                "do not use nl after the word print e.g System.out.print\"How old are you:\" ");
        System.out.println("    If you want to use special characters in your message, " +
                "you have to prefix each character with \\ ");

        System.out.println();
        System.out.println("Reference variables revision");
        System.out.println("    Use Reference variables to store date, mail messages etc");

        Date now = new Date();
        System.out.println("Date now = new Date();");
        System.out.println("    When creating Reference vars, you need to create 'new' memory space like above^");
        System.out.println("    Use the dot operator to get access to more data within the Date operator");

        System.out.println();
        System.out.println("Difference between primitive and reference");
        byte x = 1;
        System.out.println("byte x = 1;");
        byte y = x;
        System.out.println("byte y = x;");
        System.out.println("    if you update x, then y isnt changed");
        System.out.println("y =" + y);

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println("Point point1 = new Point(x: 1,y: 2);");
        System.out.println("Point point2 = point1;");
        System.out.println("point1.x = 2;");
        System.out.println("    Reference points stores the address in memory for the variable, not the actual data");
    }

    private static void Introduction() {
        System.out.println("Introduction");
        System.out.println("    JDK stands for Java Development Kit");
        System.out.println("    Use a code editor like Intellij to write code");
        System.out.println("    Java is still being used on billions of devices around the world");
        System.out.println();
        System.out.println("    Java programs are made up of Classes, Methods and Functions");
        System.out.println();

        System.out.println("Classes, Methods and Functions");
        System.out.println("    Function: Is a block of code that performs a task");
        System.out.println("    The actual code we write for the function is written between the {}");
        System.out.println();

        System.out.println("    Every Java program should have at least one function");
        System.out.println("    The first function should always be main e.g");
        System.out.println("void main() { ");
        System.out.println("    Body of code");
        System.out.println("}");
        System.out.println();

        System.out.println("    A Class is a container for related functions");
        System.out.println("    We use classes to organise our code in various sections eg");
        System.out.println("class Main{");
        System.out.println("  void main() {");
        System.out.println("    body of code for the function");
        System.out.println("  }");
        System.out.println("}");
        System.out.println();

        System.out.println("    Method is a function that is a part of a Class");
        System.out.println("    If a function is outside of a class then it is referred to as a Function");
        System.out.println();

        System.out.println("    In Java each Class should have an access modifier. An access modifier");
        System.out.println("    is a keyword that determines if other classes and methods can access it.");
        System.out.println("    They are usually named public or private e.g ");
        System.out.println();

        System.out.println("public class Main {");
        System.out.println("  public void main() {");
        System.out.println("    body of code for the function");
        System.out.println("  }");
        System.out.println("}");

        System.out.println("    Classes are named using PascalNamingConvention");
        System.out.println("    Methods are name using camelNamingConvention");
    }

    private static void tips() {
        System.out.println("********************Tips********************");

        System.out.println("Strings");
        System.out.println("    If you want user input on the same line as a question for example, " +
                "do not use nl after the word print e.g System.out.print\"How old are you:\" ");
        System.out.println("    If you want to use special characters in your message, " +
                "you have to prefix each character with \\ ");
        System.out.println("    Use dot operator to check or manipulate the string before print. Does not change original string");
        System.out.println();

        System.out.println("Variables");
        System.out.println("    When declaring variables, they need to initialised outside of code blocks,");
        System.out.println("    like IF statements and loops.");

        System.out.println("Arrays");
        System.out.println("    New way of initializing an array if contents already known using curly brackets");
        System.out.println("    int[] number = {1,2,3,4,5};");
        System.out.println();

        System.out.println("Constants");
        System.out.println("    Use the word final to lock the variable. Where possible use CAPITALS for the variable name");
        System.out.println();

        System.out.println("Maths");
        System.out.println("    Order of operations is () then */ then +-");
        System.out.println("    Use the double expression when dividing to get the remainder");
        System.out.println("double result = (double)10 / (double)3;");
        System.out.println("    Cast as int and wrap Math.random()*100 with ()");
        System.out.println("int result = (int) (Math.random()*100);");
        System.out.println("if(number % 5 == 0)");
        System.out.println("     % Modulus operator returns the remainder of a division");
        System.out.println();

        System.out.println("Casting");
        System.out.println("    Implicit casting is Java casting in the background automatically");
        System.out.println("    Explicit Casting is you forcing a type of variable to become another as long as its compatible");
        System.out.println();

        System.out.println("Number Formatting");
        System.out.println("    Use NumberFormat with the dot operator to access " +
                "different formatting methods");
        System.out.println("    To change all instances of a variable name, highlight word and right click.");
        System.out.println("    Select Refactor and then Rename. Shortcut is Shift+F6");
        System.out.println();

        System.out.println("User input");
        System.out.println("Scanner scanner = new Scanner(System.in);");
        System.out.println("    Scanner used for user input. New scanner only is needed once, after use the following format:");
        System.out.println("int age = scanner.nextByte();");
        System.out.println("String name = scanner.nextLine().trim();");
        System.out.println("    trim dot operator will trim blank spaces");
        System.out.println();

        System.out.println("Logical Operators");
        System.out.println("    && AND is used to check two values are true");
        System.out.println("    || OR is used to check if either value is true");
        System.out.println("    ! isNot is used at the start of the variable name to reverse the condition i.e is not true");
        System.out.println();

        System.out.println("If Statements");
        System.out.println("    Any variables initialised inside an if statement cant be accessed outside that code block");
        System.out.println("    Instead we initialise it before the if statement");
        System.out.println("    The curly braces after an if statement allows for a block of code to " +
                "run if that condition is met");
        System.out.println("    {} Braces only required if we have multiple statements within that IF condition");
        System.out.println();

        System.out.println("Ternary Operator");
        System.out.println("    It is made up of three parts, the condition (?) and two values separated by (:)");
        System.out.println("condition ? value1 : value2");
        System.out.println();

        System.out.println("Switch Statements");
        System.out.println("    Switch statements executes different parts of code depending");
        System.out.println("    depending on a value of an expression");
        System.out.println();

        System.out.println("Loops");
        System.out.println("For Loops:          for (int i = 1; i <= 5; i++);");
        System.out.println("While Loops:        while (i > 0 ){);");
        System.out.println("    Break statements can be used to finish the loop without finishing the rest of the code block");
        System.out.println("    Continue Statement can be used to return the loop back to the top");
        System.out.println("    Do while loops will execute at least once because the condition is at the end of the loop");
        System.out.println("    For Each Loop:      for (String fruit : fruits)");
        System.out.println();

        System.out.println("Refactoring");
        System.out.println("    Refactoring is a means to change the structure of the code without");
        System.out.println("    changing its behaviour");
        System.out.println();

        System.out.println("Classes");
        System.out.println("    A Class is a container for related functions");
        System.out.println("    They are usually named public or private");
        System.out.println("    Classes are named using PascalNamingConvention");

        System.out.println("Methods");
        System.out.println("    Method is a function that is a part of a Class");
        System.out.println("    Try to keep the main method clean and short");
        System.out.println("    Methods are name using camelNamingConvention");
        System.out.println("    Keep your methods short");
        System.out.println("    Extract repetitive patterns");
        System.out.println("    Extract highly related statements");
        System.out.println();

        System.out.println("Packaging Java files");
        System.out.println("    We need to create jar files in order to run the programs in CMD Prompt");
        System.out.println("    When trying to open jar files we need to navigate to the correct dir");
        System.out.println();
    }
}

