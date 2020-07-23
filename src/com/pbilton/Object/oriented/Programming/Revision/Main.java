package com.pbilton.Object.oriented.Programming.Revision;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String runAgain = "";
        while (!runAgain.equals("n")) {
            int selectedSection = selectSection();

            if (selectedSection == 0)tips();
            else if (selectedSection == 1)introduction();
            else if (selectedSection == 2)understandingClasses();
            else if (selectedSection == 3)creatingClasses();
            else if (selectedSection == 4)creatingObjects();
            else if (selectedSection == 5)memoryAllocation();
            else if (selectedSection == 6)proceduralProgramming();
            else if (selectedSection == 7)encapsulation();
            else if (selectedSection == 8)getters_setters();
            else if (selectedSection == 9)abstraction();
            else if (selectedSection == 10)coupling();
            else if (selectedSection == 11)constructor();
            else if (selectedSection == 12)method_overloading();
            else if (selectedSection == 13)constructor_overloading();
            else if (selectedSection == 14)refactoring();
            else if (selectedSection == 15)inheritance();
            else if (selectedSection == 16)access_modifiers();
            else if (selectedSection == 17) overriding_methods();
            else if (selectedSection == 18)upcasting_and_downcasting();
            else if (selectedSection ==19)comparing_objects();
            else if (selectedSection == 20)polymorphism();
            else if (selectedSection == 21)abstract_classes_methods();
            else if (selectedSection == 22)final_classes_methods();
            else if (selectedSection == 23)deep_inheritance_hierarchies();
            else if (selectedSection == 24)multiple_inheritance();
            else if (selectedSection == 25)interfaces();
            runAgain=re_run();
        }
    }

    private static void interfaces() {
        System.out.println("Interfaces");
        System.out.println("    A lot of misinformation is around. The meaning of interfaces have changed since java 8");
        System.out.println("    We use interfaces in Java to build loosely coupled, extensible and testable applications. ");
        System.out.println("        A------->B");
        System.out.println("            A is coupled to B");
        System.out.println("    When classes are coupled together and we make changes,");
        System.out.println("    potentially hundreds of lines of code need to be changed and recompiled.");
        System.out.println();
        System.out.println("    Using Abstraction, we want to hide the implementation details and only expose what is necessary.");
        System.out.println("    Using private key word, Class A will know less about Class B");
        System.out.println("        A - - - B");
        System.out.println("    But this is still not enough. This is where Interfaces comes in.");
        System.out.println();
        System.out.println("    With an interface Class A knows nothing about Class B, like it doesn't even exist.");
        System.out.println("    If we change B, then Class A will not be effected. ");
        System.out.println();
        System.out.println("    An interface is a type similar to a class, but it only includes method declarations, no implementations or code.");
        System.out.println("    It only defines the capabilities that a class should have.");
        System.out.println("            \t\tA----->Interface<-----B");
        System.out.println("    Now if we change the code in B, then A is not affected because it knows nothing about B. This is what");
        System.out.println("    we call *Programming against interfaces. ");
        System.out.println("    We code our programmes to work with interfaces, not concrete implementations which results in ");
        System.out.println("    applications that are loosely coupled and extensive. ");
        System.out.println("                Interfaces                 Classes");
        System.out.println("            What should be done      How it should be done");

    }

    private static void multiple_inheritance() {
        System.out.println("    Java does not support multiple inheritance as it brings to many complex problems.");
    }

    private static void deep_inheritance_hierarchies() {
        System.out.println("Deep inheritance Hierarchies");
        System.out.println("    Do not create deep inheritance hierarchy.");
        System.out.println("    Using deep inheritance hierarchy creates a pyramid structure, and when we change something in the");
        System.out.println("    base class like the constructor or any of its methods, chances are that we will have to modify ");
        System.out.println("    all the child classes connected to it.");
        System.out.println("    Up to 1 or two levels is deemed ok, but no more than 3 levels deep.");
    }

    private static void final_classes_methods() {
        System.out.println("Final Classes and Methods");
        System.out.println("    When we declare a class as final we cannot extend it anymore.");
        System.out.println("    We use final classes when we are 100% sure of its implementation and we want to prevent other");
        System.out.println("    classes from extending that class. We shouldn't really use final classes as it ");
        System.out.println("    prevents us from using inheritance and polymorphism.");
        System.out.println();
        System.out.println("    We can also declare methods as final. When doing so, we cannot override it.");
        System.out.println("    We use final when we have made certain assumptions and we don't ");
        System.out.println("    want subclasses to accidentally change the behaviour of or break our assumptions.");

    }

    private static void abstract_classes_methods() {
        System.out.println("Abstract Classes and Methods");
        System.out.println("    We use Abstract when we declare a class but we don't want to be able to create a new instance of the class");
        System.out.println("public abstract class UIControl {");
        System.out.println("   private boolean isEnabled = true;");
        System.out.println("}");
        System.out.println();
        System.out.println("    We can also make methods in the abstract class abstract themselves. This will force any classes that");
        System.out.println("    derive from the UIControl to implement this method");
        System.out.println("public abstract void render();");
        System.out.println();
    }

    private static void polymorphism() {
        System.out.println("Polymorphism");
        System.out.println("    Polymorphism means Many forms, it allows an object to take different forms.");
        System.out.println();
        System.out.println("public static void main(String[] args) {");
        System.out.println("    UIControl[] controls = {new TextBox(), new CheckBox()};");
        System.out.println("    for (var control : controls) {");
        System.out.println("    control.render();");

        System.out.println("    In each class we Override the render method that is present in the UIControl. Then in our enhanced for loop above, ");
        System.out.println("    we override the render method in the TextBox object and CheckBox object.");

//        UIControl[] controls = {new TextBox(), new CheckBox()};
//        for (var control : controls) {
//            control.render();
//        }
    }

    private static void comparing_objects() {
        System.out.println("Comparing Objects");
        System.out.println("    If we create a new class and then two instances of that class and then try");
        System.out.println("    to compare the two values, it will always return false. This is because it is comparing");
        System.out.println("    the memory location of two values.");
        System.out.println();

        System.out.println("    We need to override the base class of the equals method. In the example below we have the main class:");
        System.out.println("public static void main(String[] args) {");
        System.out.println();
        System.out.println("    var point1 = new Point(1,2);");
        System.out.println("    var point2 = new Point(1,2);");
        System.out.println("    System.out.println(point1.equals(point2));");
        System.out.println("}");
        System.out.println();

        System.out.println("    In the objects class called Point we have:");
        System.out.println();
        System.out.println("public class Point {");
        System.out.println("    private int x;");
        System.out.println("    private int y;");
        System.out.println();
        System.out.println("public Point(int x, int y) {");
        System.out.println("    this.x = x;");
        System.out.println("    this.y = y;");
        System.out.println("}");
        System.out.println();
        System.out.println("@Override");
        System.out.println("public boolean equals(Object obj) {");
        System.out.println("    if (!(obj instanceof Point))");
        System.out.println("    return false;");
        System.out.println("        var other = (Point)obj;");
        System.out.println("        return other.x == x && other.y == y;");
        System.out.println("}");
        System.out.println();

        System.out.println("    When we override the equals method we can literally pass any object through.");
        System.out.println("    This will throw an exception. To combat this we use a if statement to check that it's");
        System.out.println("    an instance of Point.");

        System.out.println("    When we override the equals method, we should also override the hashcode method.");
        System.out.println("    This will then compare the hash of the contents rather than the address of the object in memory.");
        System.out.println();

        System.out.println("@Override");
        System.out.println("public int hashCode() {");
        System.out.println("return Objects.hash(x,y);");
        System.out.println("}");
        System.out.println();
        System.out.println("    Intellij has a shortcut for doing the above. In windows the shortcut is accessed using alt + ins. Then select equals and hash.");
    }

    private static void upcasting_and_downcasting() {
        System.out.println("Upcasting and Downcasting");
        System.out.println("    Upcasting, objects within the Sub class gets casted to its parent class");
        System.out.println("    The example shows the textBox being upcasted to the UIControl as that is the parent");
        System.out.println("    Class for the TextBox class");
        System.out.println();

        System.out.println("public static void main(String[] args) {");
        System.out.println("    var control = new UIControl(true);");
        System.out.println("    var textBox = new TextBox();");
        System.out.println("    show(textBox);");
        System.out.println("}");
        System.out.println();

        System.out.println(" public static void show(UIControl control){");
        System.out.println("    System.out.println(control);");
        System.out.println(" }");
        System.out.println("}");

        System.out.println("    Because the show method accepts a control object, we can give it an instance");
        System.out.println("    of the UIControl or any of its derivatives. However at compile time we can only");
        System.out.println("    work in the members of the ui control, unless we explicitly cast this control object");
        System.out.println("    to a different type. This is what we call down casting.");
        System.out.println("    Do do this we add the following to the above example:");
        System.out.println();

        System.out.println(" public static void show(UIControl control){");
        System.out.println("    if (control instanceof TextBox) {");
        System.out.println("        var textBox = (TextBox)control;");
        System.out.println("        System.out.println(control);");
        System.out.println("    }");
        System.out.println(" }");
        System.out.println("}");
        System.out.println();

        System.out.println("    Before we are casting we need to make sure that the object");
        System.out.println("    passed here at runtime is an instance of the text box class. ");
    }


    private static void overriding_methods() {
        System.out.println("Overriding Methods");
        System.out.println("    We inherit a method from the base class but we want to change it");
        System.out.println("    This is what we call Method Overriding. For example if we want to print");
        System.out.println("    A textBox.toString it will print the memory location, not the string. We have");
        System.out.println("    to override this base class by using the following:");
        System.out.println();
        System.out.println(" @Override");
        System.out.println(" public String toString(){");
        System.out.println("    return text;");
        System.out.println(" }");
        System.out.println();
        System.out.println("    This will now override the base method and return the text stored");
        System.out.println("    in the text box.");
    }

    private static void access_modifiers() {
        System.out.println("Access Modifiers");
        System.out.println("    Protected is like public but within the package. It is considered bad practice");
        System.out.println("    as it makes it confusing and hard to maintain our programs");
        System.out.println("    Use public for anything that should be exposed to anything outside the Class and");
        System.out.println("    private for hiding the implementation detail.");
    }

    private static void inheritance(){
        System.out.println("Inheritance");
        System.out.println("    Inheritance means that we can set behaviours in the Base/Super/Parent class and these can be passed");
        System.out.println("    onto the Sub/Child Class. The Child class inherits these behaviours");
        System.out.println("    If we have two classes, we can extend the parent class methods into the Child Class, which can then be called upon");
        System.out.println();

        System.out.println(" public class UiControl extends TextBox{");
        System.out.println("    When we create a new UiControl object, we can now call upon the methods within the TextBox Class by extending the TextBox");
        System.out.println("    We can then access this using the dot operator in the parent object");
        System.out.println();

        System.out.println("Inheritance and Constructors");
        System.out.println("    When using Inheritance, the Base Constructor is ran first, then the sub class constructor is ran ");
        System.out.println("    If the base constructor has a parameter then we get error on the sub constructor, to rectify");
        System.out.println("    this we need to explicitly call the constructor of the base class using the super() operator");
        System.out.println("    The super() statement needs to be the first command in the sub constructor");
        System.out.println("public TextBox() {");
        System.out.println(" super(true);");
        System.out.println();
        System.out.println("    Try to keep inheritance to minimum levels as possible.");
    }

    private static void refactoring() {
        System.out.println("Refactoring");
        System.out.println("    When we want to extract methods, change signatures etc we ");
        System.out.println("    want to use the Refactor tool and it sub menus");
        System.out.println("    Intellij will make the required changes in the code automatically to ");
        System.out.println("    minimise errors.");
        System.out.println();

        System.out.println("Extracting a Class from the Main:");
        System.out.println("    Place the cursor on the method name, then select Refactor and 'Refactor This'");
        System.out.println("    or the shortcut is 'CTRL + Alt + Shift + T'");
        System.out.println("    Select 'Move' then either type the full package name out with the new Class name at the end");
        System.out.println("    Select what members we want to move, then select visibility to public. Intellij");
        System.out.println("    will create the new class if it isn't already created.");
        System.out.println("    Intellij will also import anything that is needed like the Scanner class, it will adjust any ");
        System.out.println("    code that calls the class we just moved. This is called 'Safe Refactoring'");
        System.out.println();

        System.out.println("    Under the 'Code' menu, we can select 'Generate' with this tool we can generate");
        System.out.println("    Constructors, Setters and Getters among other things");
        System.out.println();
    }

    private static void constructor_overloading() {
        System.out.println("Constructor Overloading");
        System.out.println("    Overloading the constructor method is when we want to pass less parameters,");
        System.out.println("    we can duplicate the constructor but without the parameter that is 0,");
        System.out.println("    but leave the original constructor for when we do need the extra parameter");
        System.out.println();

        System.out.println("Main Class:");
        System.out.println(" public static void main(String[] args) {");
        System.out.println("    new Employee(50_000);");
        System.out.println("    var employee = new Employee(50_000, 20);");
        System.out.println("    int wage = employee.calculateWage(10);");
        System.out.println("    System.out.println(wage);");
        System.out.println(" }");
        System.out.println();

        System.out.println("Employee Class:");
        System.out.println(" public Employee(int baseSalary){");
        System.out.println("        //Overloaded Constructor method");
        System.out.println("    this(baseSalary, 0 );");
        System.out.println(" }");
        System.out.println();

        System.out.println(" public Employee(int baseSalary, int hourlyRate){");
        System.out.println("        //Original Constructor method");
        System.out.println("    setBaseSalary(baseSalary);");
        System.out.println("    setHourlyRate(hourlyRate);");
        System.out.println(" }");
        System.out.println();

//        new Employee(50_000);
//        var employee = new Employee(50_000, 20);
//        Employee.printNumberOfEmployees();
//        int wage = employee.calculateWage(10);
//        System.out.println(wage);
    }

    private static void method_overloading() {
        System.out.println("Method Overloading");
        System.out.println("    Creating different implementations of a method but with different parameters");
        System.out.println("    It is bad practice to overuse Method Overloading and can make the code unreadable");
        System.out.println("    However, it is useful when using completely different parameters");
        System.out.println("    To do Method Overloading, highlight the method in question, press ctl + D");
        System.out.println("    Then call the original method with the new parameters i.e");
        System.out.println();

        System.out.println(" public int calculateWage(){");
        System.out.println("    return calculateWage(0);");
        System.out.println(" }");
        System.out.println();
    }

    private static void constructor() {
        System.out.println("Constructors");
        System.out.println("    In the example below, when we create a new Employee object we want to set the values using a constructor");
        System.out.println("    If we don't create Constructors, the Java compiler will and set all values to");
        System.out.println("    default. I.e boolean to false, int's to 0 etc");
        System.out.println("    The Constructor in a class always has the same name as the class it's representing.");
        System.out.println();

        System.out.println("Main Class:");
        System.out.println("public static void main(String[] args) {");
        System.out.println("  var employee = new Employee(50_000, 20);");
        System.out.println("  int wage = employee.calculateWage(10);");
        System.out.println("  System.out.println(wage);");
        System.out.println("}");
        System.out.println();

        System.out.println("In the Employee Class, the values are passed to a Constructor method");

        System.out.println("public class Employee {");
        System.out.println("    private int baseSalary;");
        System.out.println("    private int hourlyRate;");
        System.out.println();

        System.out.println("    public Employee(int baseSalary, int hourlyRate){   //Constructor Method");
        System.out.println("        setBaseSalary(baseSalary);");
        System.out.println("        setHourlyRate(hourlyRate);");
        System.out.println("    }");
        System.out.println();

        System.out.println("    public int calculateWage(int extraHours){");
        System.out.println("        return baseSalary +(hourlyRate*extraHours);");
        System.out.println("    }");
        System.out.println();

        System.out.println("    private void setBaseSalary(int baseSalary) {");
        System.out.println("        if (baseSalary <=0)");
        System.out.println("            throw new IllegalArgumentException(\"Salary cannot be 0 or less\");");
        System.out.println("        this.baseSalary = baseSalary;");
        System.out.println("    }");
        System.out.println();

        System.out.println("    private int getBaseSalary() {");
        System.out.println("        return baseSalary;");
        System.out.println("    }");
        System.out.println();

        System.out.println("    private void setHourlyRate(int hourlyRate) {");
        System.out.println("        if (hourlyRate <=0)");
        System.out.println("            throw new IllegalArgumentException(\"Hourly rate cannot be less than 0\");");
        System.out.println("        this.hourlyRate = hourlyRate;");
        System.out.println("    }");
        System.out.println();

        System.out.println("    private int getHourlyRate() {");
        System.out.println("        return hourlyRate;");
        System.out.println("    }");
        System.out.println("}");

    }

    private static void coupling() {
        System.out.println("Coupling");
        System.out.println("    The level of dependency between classes");
        System.out.println("    Its best to reduce the dependency of one class to another");
        System.out.println("    If Class A is dependant on Class B and Class B is dependant on Class C, and then we");
        System.out.println("    need to modify Class C, Class B will also need modifying and likely so will Class A");
        System.out.println();

        System.out.println("    When we create a new class, separate from our Main class, we only want the Main class to have access");
        System.out.println("    to the methods from the separate class that it needs to. We do this by changing the access modifier");
        System.out.println("    for that method to private. That method can then only be called in the class it was created");
        System.out.println("    This will reduce the chances of errors in the Main class if we decide to modify a method in the");
        System.out.println("    separate class. We are reducing the coupling effect");
        System.out.println();
    }

    private static void abstraction() {
        System.out.println("Abstraction");
        System.out.println("    Abstraction means 'Reduce complexity by hiding unnecessary details'");
        System.out.println();
    }

    private static void getters_setters() {
        System.out.println("Getters and Setters:");
        System.out.println("    In java we want to make our fields private and use setters and getters to access them");
        System.out.println("    You can either manually type these out, or change the variable access modifier to private");
        System.out.println("    and then right click the variable. Select Refactor and then encapsulate fields ");
        System.out.println("    This will give you the option to automatically create Setters and Getters for that variable");
        System.out.println("    We can change our example code to represent this");
        System.out.println();

        System.out.println("    In the main class it would look like this:");
        System.out.println("var employee1 = new Employee();");
        System.out.println("employee1.setBaseSalary(50_000);");
        System.out.println("employee1.setHourlyRate(20);");
        System.out.println("int wage1 = employee1.calculateWage(10);");
        System.out.println("System.out.println(wage1);");
        System.out.println();

        System.out.println("var employee2 = new Employee();");
        System.out.println("employee2.setBaseSalary(30_000);");
        System.out.println("employee2.setHourlyRate(40);");
        System.out.println("int wage2 = employee2.calculateWage(50);");
        System.out.println("System.out.println(wage2);");
        System.out.println();

        System.out.println("    Using the above method, we can pass the salary, hourly rate and extra hours to our employee class");
        System.out.println("    In return we get the values we need and gets put in wage. Using this method we can reuse the same class");
        System.out.println("    over and over but the fields have independent values");
        System.out.println();

        System.out.println("    The employee class will look like this:");
        System.out.println(" public class Employee {");
        System.out.println("    private int baseSalary;");
        System.out.println("    private int hourlyRate;");
        System.out.println();

        System.out.println(" public int calculateWage(int extraHours){");
        System.out.println("  return baseSalary +(hourlyRate*extraHours);");
        System.out.println(" }");
        System.out.println();

        System.out.println(" public int getBaseSalary() {");
        System.out.println("  return baseSalary;");
        System.out.println(" }");
        System.out.println();

        System.out.println(" public void setBaseSalary(int baseSalary) {");
        System.out.println("    if (baseSalary <=0)");
        System.out.println("    throw new IllegalArgumentException(\"Salary cannot be 0 or less\");");
        System.out.println("        //throw means it will end the program with an error. IllegalArgumentException will");
        System.out.println("        // pass the error reason to the user");
        System.out.println("    this.baseSalary = baseSalary;");
        System.out.println(" }");
        System.out.println();

        System.out.println(" public int getHourlyRate() {");
        System.out.println("  return hourlyRate;");
        System.out.println(" }");
        System.out.println();

        System.out.println(" public void setHourlyRate(int hourlyRate) {");
        System.out.println("    if (hourlyRate <=0)");
        System.out.println("    throw new IllegalArgumentException(\"Hourly rate cannot be less than 0\");");
        System.out.println("    this.hourlyRate = hourlyRate;");
        System.out.println(" }");
        System.out.println("}");
        System.out.println();
    }

    private static void encapsulation() {
        System.out.println("Encapsulation");
        System.out.println("    Bundle the data and methods that operate on the data in a single unit");
        System.out.println();

        System.out.println("    In our Main class we can cut the example down to a few lines of code by encapsulating");
        System.out.println("    everything into new classes within the src folder");
        System.out.println();

        System.out.println("public static void main(String[] args) {");
        System.out.println(" var employee = new Employee();");
        System.out.println(" employee.baseSalary = 50_000;");
        System.out.println(" employee.hourlyRate = 20;");
        System.out.println(" int wage = employee.calculateWage(10);");
        System.out.println(" System.out.println(wage);");
        System.out.println("}");
        System.out.println();

        System.out.println("    We then create a new class called Employee and use the dot operator to use");
        System.out.println("    the calculateWage method, with this we send the int extraHours");
        System.out.println();

        System.out.println("    The Employee Class looks like this:");
        System.out.println("public class Employee {");
        System.out.println(" public int baseSalary;");
        System.out.println(" public int hourlyRate;");
        System.out.println("    We don't want to set these variables as that would make the values the same for");
        System.out.println("    every employee");
        System.out.println();

        System.out.println(" public int calculateWage(int extraHours){");
        System.out.println("    We don't need to pass the parameters in the method call as we are storing them");
        System.out.println("    inside the main field in this Class");
        System.out.println();

        System.out.println("    return baseSalary +(hourlyRate*extraHours);");
        System.out.println(" }");
        System.out.println("}");
        System.out.println();
    }

    private static void proceduralProgramming() {
        System.out.println("Procedural Programming");
        System.out.println("    If this program had more features, the main method would end up quite large. This style of");
        System.out.println("    programming is just calling other methods, in a very procedural way");
        System.out.println();

        System.out.println("public static void main(String[] args) {");
        System.out.println(" int baseSalary = 50_000;");
        System.out.println(" int extraHours = 10;");
        System.out.println(" int hourlyRate = 20;");
        System.out.println();

        System.out.println(" int wage = calculateWage(baseSalary,extraHours,hourlyRate);");
        System.out.println(" System.out.println(wage);");
        System.out.println("}");
        System.out.println();

        System.out.println("public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){");
        System.out.println(" return baseSalary +(extraHours*hourlyRate);");
        System.out.println();

        System.out.println("    Procedural programs are very hard to maintain,as soon as you change something,");
        System.out.println("    the code will break and make it very hard to find the fault");
        System.out.println("    There is also the lack of reusability because everything is linked to each other.");
        System.out.println();
    }

    private static void memoryAllocation() {
        System.out.println("Memory Allocation");
        System.out.println();

        System.out.println("    There is two different areas of memory that data is stored, Heap & Stack");
        System.out.println("    Heap: Heap is where it stores Objects data");
        System.out.println("    Stack: Stack is where it stores Primitives and short-lived variables");
        System.out.println();

        System.out.println("Example 1");
        System.out.println("var textBox1 = new TextBox();");
        System.out.println("    Java evaluates the righthand side 1st and will create a new TextBox and store it on the Heap");
        System.out.println("    It will then execute the lefthand side and allocate memory on the stack. It will store the Heap memory");
        System.out.println("    address of the TextBox and store it on the Stack. This is why they are called reference variables, as");
        System.out.println("    they reference the memory location, not the actual values.");
        System.out.println();

        System.out.println("Example 2");
        System.out.println("var textBox1 = new TextBox();");
        System.out.println("var textBox2 = textBox1;");
        System.out.println("textBox2.setText(\"Hello world\");");
        System.out.println("System.out.println(textBox1.text);");
        System.out.println("    textBox1 & textBox2 will always be the same value,");
        System.out.println("    as both are referencing the same object");
        System.out.println();

        System.out.println("    Once the Main method is finished executing, the values in the Stack memory is automatically removed");
        System.out.println("    As the object on the Heap is no longer referenced it has no purpose. After a certain amount of time Java");
        System.out.println("    will remove this. This is called garbage collection.");
        System.out.println();
    }

    private static void creatingObjects() {
        System.out.println("Creating Objects");
        System.out.println();

        System.out.println("var textBox1 = new TextBox();");
        System.out.println("    We are creating a new instance of the class TextBox and calling it textbox1");
        System.out.println();

        System.out.println("textBox1.setText(\"Box 1\");");
        System.out.println("    Using dot operator we can use the setText from the TextBox Class to set textBox1");
        System.out.println("System.out.println(textBox1.text);");
        System.out.println("    **If we don't initialise the variable, it will return 'null' and crash our program");
        System.out.println("    We can stop this from happening by initialising String text to \"\" so its blank**");
        System.out.println();

        System.out.println("var textBox2 = new TextBox();");
        System.out.println("textBox2.setText(\"Box 2\");");
        System.out.println("System.out.println(textBox2.text);");
        System.out.println("    Using the TextBox class, we can use the methods within it to create a new object called textBox2");
        System.out.println("    with separate data");
        System.out.println();

        //Example code
//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);
    }

    public static void creatingClasses(){
        System.out.println("Creating Classes");
        System.out.println();

        System.out.println("    Create a new class by opening up the project tab,");
        System.out.println("    Open on src folder, then the package folder, right click on 'Main' and select new Java Class");
        System.out.println("    This will open a new class next to the main class.");
        System.out.println();

        System.out.println("    We select public or private as a access modify,");
        System.out.println("    this will determine if it can be accessed by other classes or not");
        System.out.println();

        System.out.println("    Once we have created a new class, in this example called TextBox, we can write our code:");
        System.out.println("Example TextBox Class");
        System.out.println();

        System.out.println("public class TextBox {");
        System.out.println("    public String text; //Field");
        System.out.println();

        System.out.println("    public void setText(String text){");
        System.out.println("        this.text = text;");
        System.out.println("    }");
        System.out.println();

        System.out.println("    public void clear(){");
        System.out.println("        this.text =\"\";");
        System.out.println("    }");
        System.out.println("}");

        System.out.println("this dot operator is useful when the name of a parameter is the same name as the field");
        System.out.println("'this' dot operator inherits methods from other classes");
        System.out.println();
    }

    private static void understandingClasses() {
        System.out.println("Classes");
        System.out.println("    Classes and Objects");
        System.out.println();

        System.out.println("    Classes: A blueprint for creating objects");
        System.out.println("    Object: An instance of a class");
        System.out.println();

        System.out.println("    For instance, we could have a Class called 'car'");
        System.out.println("    Within this class we will have fields that are made up of states, like currentSpeed, currentGear etc");
        System.out.println("    We can then have methods that change the states. Methods like start(), stop(), changeGear() etc ");
        System.out.println();

        System.out.println("    We can then have objects, that are instances of a class. In this example we would have car1, car2, car3");
        System.out.println("    These car instances will all be made up using the Car class");
        System.out.println("    Each car object will be independent from each other and hold independent data");
        System.out.println("    UML: Unified Modelling Language is a simple visual language used to show classes and their relationships  ");
        System.out.println();

        System.out.println("    Another example:");
        System.out.println("    A class called Lamp");
        System.out.println("    A field with a state called isOn: boolean");
        System.out.println("    It can have two methods turnOn() and turnOff()");
        System.out.println();

        System.out.println("    Class: TV");
        System.out.println("    Field/States: currentVolume, currentChannel, isOn");
        System.out.println("    Methods: turnOn(), turnOff(), increaseVolume(), decreaseVolume() etc");
        System.out.println();

        System.out.println("    Class: TextBox");
        System.out.println("    Field/States: text, limit, length, isFocused etc");
        System.out.println("    Methods: setText(), clear(), enable(), disable() etc");
        System.out.println();

        System.out.println("Creating Objects");
        System.out.println("    We can create new instances of the class and use its methods. The data in each instance");
        System.out.println("    will be independent of each other");
    }

    private static void introduction() {
        System.out.println("Introduction");
        System.out.println();

        System.out.println("    Programing Paradigms means the style of programming i.e Functional, object-oriented, logic, procedural, event-driven");
        System.out.println("    The best Paradigms is which ever one solves the problem the best");
        System.out.println("    Object programming is based on Data(state) and Methods(Behaviour)");
        System.out.println();

        System.out.println("    Benefits of Object-oriented programming");
        System.out.println("    Objects interact with each other in order to build a larger program");
        System.out.println("    Benefits of OOP is reduced complexity as we can build smaller sections that are easier to understand and maintain");
        System.out.println("    Easier maintenance as smaller section/objects are easier to maintain");
        System.out.println("    These smaller objects if done correctly can be reused in other applications");
        System.out.println("    Faster development due to the above points");
        System.out.println("    However it would be beneficial to learn both Object Oriented and Functional programming languages");
        System.out.println();
    }

    private static void tips() {
        System.out.println("Tips");
        System.out.println();

        System.out.println("Introduction");
        System.out.println("    Object programming is based on Data(state) and Methods(Behaviour)");
        System.out.println("    Benefits of OOP is reduced complexity as we can build smaller sections that");
        System.out.println("    are easier to understand and maintain");
        System.out.println();

        System.out.println("Classes and Objects");
        System.out.println("    A Class is a blueprint or template for creating objects.");
        System.out.println("    UML: Unified Modelling Language is a simple visual language used to show classes and their relationships  ");
        System.out.println("    An example of a class is: ");
        System.out.println("    Class: TV");
        System.out.println("    Field/States: currentVolume, currentChannel, isOn");
        System.out.println("    Methods: turnOn(), turnOff(), increaseVolume(), decreaseVolume() etc");
        System.out.println();

        System.out.println("Creating a Class");
        System.out.println("    Create a new class by opening up the project tab,");
        System.out.println("    Open on src folder, then the package folder, right click on 'Main' and select new Java Class");
        System.out.println("    This will open a new class next to the main class.");
        System.out.println();

        System.out.println("Classes and variables");
        System.out.println("    If we don't initialise the variable, it will return 'null' and crash our program");
        System.out.println("    We can stop this from happening by initialising String text to \"\" so its blank");
        System.out.println();

        System.out.println("Memory Allocation");
        System.out.println("    There is two different areas of memory that data is stored, Heap & Stack");
        System.out.println("    Right hand side of an evaluation is stored on the Heap as it's an Object");
        System.out.println("    Left hand side is stored on the Stack as this simply references the memory address of the Object");
        System.out.println("    Memory De-Allocation happens automatically once the main method has finished executing");
        System.out.println("    Once finished executing, the variables in the Stack memory are cleared. As the Objects in the Heap");
        System.out.println("    Memory is no longer referenced, these are cleared after a short amount of time. This is called");
        System.out.println("    Garbage Collection");
        System.out.println();

        System.out.println("Encapsulation");
        System.out.println("    Bundle the data and methods that operate on the data in a single unit or separate class");
        System.out.println();

        System.out.println("Getters and Setters:");
        System.out.println("    In java we want to make our fields private and use setters and getters to access them");
        System.out.println("    Select Refactor and then encapsulate fields to automatically use setters and getters");
        System.out.println();

        System.out.println("Throw");
        System.out.println("   Throw means it will end the program with an error. IllegalArgumentException will");
        System.out.println("   pass the error reason to the user");
        System.out.println();

        System.out.println("Abstraction");
        System.out.println("    Abstraction means 'Reduce complexity by hiding unnecessary details'");
        System.out.println();

        System.out.println("Coupling");
        System.out.println("    The level of dependency between classes");
        System.out.println("    Set methods in separate classes to private if not needed in the Main class");
        System.out.println();

        System.out.println("Constructor");
        System.out.println("    We want to to initialise valid values in our new class whilst keeping the Main Class simple");
        System.out.println("    We do this by passing our values to a Constructor method in a separate class");
        System.out.println("    We can use this. dot operator to create a variable imported into the class that has the same name");
        System.out.println("this.text = text;");
        System.out.println();

        System.out.println("Method Overloading");
        System.out.println("    Creating different implementations of a method but with different parameters");
        System.out.println();

        System.out.println("Constructor Overloading");
        System.out.println("    Overloading the constructor method is when we want to pass less parameters so that we can set an inital");
        System.out.println("    value");
        System.out.println();

        System.out.println("View Deceleration");
        System.out.println("    CTL + B");
        System.out.println();

        System.out.println("Extracting Methods into a new class");
        System.out.println("    Place the cursor onto the name of the method and either select Refactor followed by 'Refactor this'");
        System.out.println("    or press 'CTRL + ALT + Shift + T' in this menu select Move Members, when name the new class with the projects package name");
        System.out.println("    and also select the public access modifier. Intellij will adapt all the necessary code.");
        System.out.println("    This is called 'Safe Refactoring'");
        System.out.println();

        System.out.println("Inheritance");
        System.out.println("    Inheritance means that we can set behaviours in the Base/Super/Parent class and these can be passed");
        System.out.println("    onto the Sub/Child Class. The Child class inherits these behaviours");
        System.out.println();

        System.out.println("The Object Class");
        System.out.println("    Java automatically creates object class. If we use the dot operator on our object, we can utilise functions");
        System.out.println("    like hashCode(),equals(),notify etc");
        System.out.println();
    }

    public static int selectSection(){
        System.out.println("0- Tips, 1- Introduction, 2- Understanding Class, 3-Creating Classes, 4- Creating Objects");
        System.out.println("5- Memory Allocation, 6- Procedural Programming, 7- Encapsulation, 8- Setters and Getters");
        System.out.println("9- Abstraction, 10- Coupling, 11- Constructors, 12- Method Overloading, 13- Constructor Overloading");
        System.out.println("14- Refactoring, 15- Inheritance, 16- Access Modifiers, 17-Overriding Methods, 18- Upcasting and Downcasting,");
        System.out.println("19- Comparing Objects, 20- Polymorphism, 21- Abstract Classes and Methods, 22- Final Classes and Methods,");
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



