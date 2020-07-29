package com.pbilton.Object.oriented.Programming.Revision;
public class sections {

    public static void runSelection(int selectedSection) {
        if (selectedSection == 0) tips();
        else if (selectedSection == 1) introduction();
        else if (selectedSection == 2) understandingClasses();
        else if (selectedSection == 3) creatingClasses();
        else if (selectedSection == 4) creatingObjects();
        else if (selectedSection == 5) memoryAllocation();
        else if (selectedSection == 6) proceduralProgramming();
        else if (selectedSection == 7) encapsulation();
        else if (selectedSection == 8) getters_setters();
        else if (selectedSection == 9) abstraction();
        else if (selectedSection == 10) coupling();
        else if (selectedSection == 11) constructor();
        else if (selectedSection == 12) method_overloading();
        else if (selectedSection == 13) constructor_overloading();
        else if (selectedSection == 14) refactoring();
        else if (selectedSection == 15) inheritance();
        else if (selectedSection == 16) access_modifiers();
        else if (selectedSection == 17) overriding_methods();
        else if (selectedSection == 18) upcasting_and_downcasting();
        else if (selectedSection ==19) comparing_objects();
        else if (selectedSection == 20) polymorphism();
        else if (selectedSection == 21) abstract_classes_methods();
        else if (selectedSection == 22) final_classes_methods();
        else if (selectedSection == 23) deep_inheritance_hierarchies();
        else if (selectedSection == 24) multiple_inheritance();
        else if (selectedSection == 25) interfaces();
        else if (selectedSection == 26) tightly_coupled_code();
        else if (selectedSection == 27) creating_interfaces();
        else if (selectedSection == 28) dependency_injection();
        else if (selectedSection == 29) constructor_injection();
        else if (selectedSection == 30) setter_injection();
        else if (selectedSection == 31) method_injection();
        else if (selectedSection == 32) interface_segregation();
        else if (selectedSection == 33) interface_fields();
        else if (selectedSection == 34) static_methods_interface();
        else if (selectedSection == 35) private_methods_interface();
        else if (selectedSection == 36) difference_interfaces_abstract();
    }

    private static void difference_interfaces_abstract() {
        System.out.println("Whats the difference between Interfaces and abstract  classes?");
        System.out.println("    This is a popular interview question.");
        System.out.println("    Interfaces are like contracts used to build loosly-coupled, extensible and testable applications");
        System.out.println("    However interfaces are being abusing interfaces to allow multiple inheritance because of the new");
        System.out.println("    features the team behind Java have brought in.  ");
        System.out.println();
        System.out.println("    Abstract Classes are partially-completed Classes and are used to share code.");
    }

    private static void private_methods_interface() {
        System.out.println("Private Methods");
        System.out.println("    Another feature introduced in Java 9 was the ability to implement private methods in ");
        System.out.println("    an interface. Private methods are implementation details, which isn't what an ");
        System.out.println("    interface is for. Again, an interface is like a contract, it should have no implementation, ");
        System.out.println("    no fields, no static methods, no private methods no nothing execpt for method declarations.");
    }

    private static void static_methods_interface() {
        System.out.println("Static Methods and Interfaces");
        System.out.println("    Some user's create methods that have implementation or code within them. Interface's are not designed for this,");
        System.out.println("    the interface is about what the code should do, not how the code should do it. ");
        System.out.println("    If we wanted to create a method that is shared across lots of classes, instead of putting the logic in the interface,  ");
        System.out.println("    we should use an abstract class. We first define an abstract class and then move the logic there so it can be shared by all its children.");
        System.out.println("    Once we've moved the logic to the abstract class, we don't want it to be static, instead we use the ");
        System.out.println("    protected access modifier. It is hidden from the outside but it can be used in classes that inherit from this abstract tax calculator. ");
        System.out.println();

        System.out.println(" public abstract class AbstractTaxCalculator implements TaxCalculator {");
        System.out.println("    protected double getTaxableIncome(double income, double expenses){");
        System.out.println("      return income - expenses;");
        System.out.println("    }");
        System.out.println(" }");
    }

    private static void interface_fields() {
        System.out.println("Fields and Interfaces");
        System.out.println("    Over the past few years a number of features have been implemented into ");
        System.out.println("    Java which has changed the meaning of interfaces. One of these features is declaring fields in our interfaces.");
        System.out.println();

        System.out.println("    We should not be declaring fields in our interfaces as they are final and cannot be changed. Instead they should be");
        System.out.println("    declared in our implementations. If we have a constance in our interface and we then change it or remove it in the future,");
        System.out.println("    it will affect everything else tied to that interface. This is something the team behind Java has added to interfaces.");
    }

    private static void interface_segregation() {
        System.out.println("Interface Segregation Principle");
        System.out.println("    Interface Segregation Principle means we should divide big interfaces into smaller ones, ");
        System.out.println("    this will reduce the impact of changes.");
        System.out.println();

        System.out.println("    In this example we have created a new interface called UIWidget. Within this interface we");
        System.out.println("    want to be able to drag, resize and render.");
        System.out.println();
        System.out.println("public interface UIWidget {");
        System.out.println("     void drag();");
        System.out.println("     void resize();");
        System.out.println("     void render();");
        System.out.println();

        System.out.println("    If we create a class that utilise this interface for instance a dragger class ");
        System.out.println("    and then we change the field for the resize method then the dragger class has to be recompiled ");
        System.out.println("    even though it has nothing to do with the drag method. This is where Interface Segregation Principle");
        System.out.println("    comes into play. It states that we should divide this interface into smaller ones. We want each interface");
        System.out.println("    to only be concerned with methods that are relevant to each other.");
        System.out.println();

        System.out.println("    We separate all the methods to their own interfaces. I.e drag is put into an interface called Draggable");
        System.out.println(" public interface Draggable {");
        System.out.println("    void drag();");
        System.out.println(" }");
        System.out.println();

        System.out.println("    Then in a class called Dragger, it implements the Draggable interface and ");
        System.out.println("    the only dot operator available is the method in Draggable. However, if we wanted to be able to ");
        System.out.println("    call all these methods then we go back to the UIWidget and extends the Draggable interface.");
        System.out.println();

        System.out.println("    When we are carrying out the above, Intellij can actually do this for us using the refactoring shortcut.");
        System.out.println("    Select extract interface and the methods we want in that class. Select No when prompted about the usage. ");

        System.out.println("    The main point to take away is not to create 3 new interfaces because we have 3 methods, but we ");
        System.out.println("    should separate them based on their capabilities.");
    }

    private static void method_injection() {
        System.out.println("Method Injection");
        System.out.println("    With method injection we can pass the dependency to the method that meets that dependency. Most of the ");
        System.out.println("    time we use constructor injection because with that approach we can quickly see the dependencies of a class.");
        System.out.println();
        System.out.println("    Below, we are calling the show method in the TaxReport class and injecting the dependency at the same time:");
        System.out.println(" report.show(new TaxCalculator2019(125_000));");
    }

    private static void setter_injection() {
        System.out.println("Setter Injection");
        System.out.println("    The benefit of setter injection is that we can change the dependency throughout the life time of the program");
        System.out.println("    In our TaxReport class from our Tax calculate program we create a setCalculator setter:");
        System.out.println();
        System.out.println(" public void setCalculator(TaxCalculator calculator) {");
        System.out.println("    this.calculator = calculator;");
        System.out.println(" }");
        System.out.println();

        System.out.println("    We can then for example create a new TaxCalculator class that implements the TaxCalculator interface for 2019.");
        System.out.println("    Inside main, we use the setter to set the TaxReport to TaxCalculator2019:");
        System.out.println();

        System.out.println("public static void main(String[] args) {");
        System.out.println(" var calculator = new TaxCalculator2018(100_000);");
        System.out.println(" var report = new TaxReport(calculator);");
        System.out.println(" report.show();");
        System.out.println();

        System.out.println(" report.setCalculator(new TaxCalculator2019());");
        System.out.println(" report.show();");
        System.out.println("}");
        System.out.println();

        System.out.println("    Constructor injection is a more common approach unless you need to use setter injection.");
        System.out.println("    All setters should be at the end to be clean and consistent");
    }

    private static void constructor_injection() {
        System.out.println("Constructor Injection");
        System.out.println("    We don't want our classes to be dependant on concrete implementations. We want them to use the interface.");
        System.out.println("    Using the tightly coupled code example TaxReport class we change it from:");
        System.out.println();

        System.out.println("public TaxReport(){");
        System.out.println(" calculator = new TaxCalculator(100_000);");
        System.out.println("}");
        System.out.println();
        System.out.println("    To this:");
        System.out.println();
        System.out.println("public TaxReport(TaxCalculator calculator){");
        System.out.println(" this.calculator = calculator;");
        System.out.println("}");

        System.out.println("    We added a parameter calling the interface TaxCalculator and used this.calculator for our field. ");
        System.out.println("    This is called constructor injection. We are injecting a dependency, in this case TaxCalculator. ");
        System.out.println("    Using this method, TaxReport does not depend on concrete implementations, it does not care if ");
        System.out.println("    TaxCalculator2018 is changed to TaxCalculator2019. Likewise, we can change the values in calculateTax and only that");
        System.out.println("    class will need to be recompiled. ");
        System.out.println();
        System.out.println("    The way we have implemented this injection is called poor mans dependency injection as we ");
        System.out.println("    have created a new object to injected the dependency.");
        System.out.println("    If we have hundreds of classes, we can use a dependency injection framework. Spring is one of the popular ones. ");

    }

    private static void dependency_injection() {
        System.out.println("Dependency Injection");
        System.out.println("    Our classes should not instantiate their dependencies.");
        System.out.println("    In our example, the TaxReport class should not create the TaxCalculator2018 object, it should only use it.");
        System.out.println("    Creating the object and using the object is two different things, these should be separated. ");
        System.out.println("    This is called the separation of concerns, we do this using Dependency Injection");
        System.out.println("    Dependency Injection can be achieved using: Constructor Injection");
        System.out.println("                                                Setter Injection");
        System.out.println("                                                Method Injection");
    }

    private static void creating_interfaces() {
        System.out.println("Creating an Interface");
        System.out.println("    To create a new interface in Intellij, go to the projects tab and select new class,");
        System.out.println("    then we can change the type to interface.");
        System.out.println();

        System.out.println("    In C sharpe, user's prefix the name of interfaces with I. e.g ICalculateTax");
        System.out.println("    In java, one way to prefix an interface is to use Can e.g CanCalculateTax");
        System.out.println("    and another way is able e.g Draggable or Resizable.");
        System.out.println();

        System.out.println("    In the interface we don't have any states or fields, we only have method declarations ");
        System.out.println("    that determine what needs to be done.");
        System.out.println("    As the interface only contains methods that must be implemented by a class, there is no ");
        System.out.println("    need for the public key word when declaring methods.");
        System.out.println();
        System.out.println("    We can not instantiate a interface like a class e.g var c = new TaxInterface();");
        System.out.println("    Instead we use the implements key word when declaring our class");
        System.out.println();
        System.out.println(" public class TaxCalculator2018 implements TaxCalculator {");
        System.out.println();

        System.out.println("    As best practice we should also apply the @Override annotation for interface methods.");
        System.out.println("    The benefit of using this annotation is if at some point we remove the method call from the interface,");
        System.out.println("    the @Override will highlight a complication error as it tells the compiler ");
        System.out.println("    that we are implementing a interface method but this method does not exist.");
    }

    private static void tightly_coupled_code() {
        System.out.println("Tightly-coupled Code");
        System.out.println("    The following is an example of a tightly coupled tax report program.");
        System.out.println("    If we were to code this, and then modify the constructors for example an add an extra parameter,");
        System.out.println("    then we have to modify the Tax report constructor. This isn't to bad for a small program, but ");
        System.out.println("    if we are creating a large program with 10 classes linked to the Tax Calculator we will have change them all.");
        System.out.println();

        System.out.println("public class TaxCalculator {");
        System.out.println("   private double taxableIncome;");
        System.out.println("    public TaxCalculator(double taxableIncome) {");
        System.out.println("            this.taxableIncome = taxableIncome;");
        System.out.println("        }");
        System.out.println("        public double calculateTax(){");
        System.out.println("            return taxableIncome * 0.3;");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println();

        System.out.println("    Then we have the report class:");
        System.out.println();
        System.out.println("   public class TaxReport {");
        System.out.println("    private TaxCalculator calculator;");
        System.out.println("       public TaxReport(){");
        System.out.println("         calculator = new TaxCalculator(100_000);");
        System.out.println("       }");
        System.out.println();
        System.out.println("       public void show(){");
        System.out.println("         var tax = calculator.calculateTax();");
        System.out.println("         System.out.println(tax);");
        System.out.println("       }");
        System.out.println("   }");
        System.out.println();
        System.out.println("    You can see that the report class is tightly coupled, we can solve this by Programming with Interfaces");
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
        System.out.println();

        System.out.println("When to use an Interface");
        System.out.println("We should use interfaces for every class in our program, thats not what it is for. ");
        System.out.println("The benefits of Interfaces is that we can easily swap implementations for one another.");
        System.out.println("We can also easily extend our applications as we can program against an interface rather than a ");
        System.out.println("concrete implementation. Another benefit is that we can test our classes in isolation, this is called Unit Testing.");


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

    private static void creatingClasses(){
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

}
