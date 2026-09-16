package lec_h_Polymorphism;

public class DemoClass {

    public static void main(String[] args) {

        System.out.println("========== POLYMORPHISM ==========");

        System.out.println();
        System.out.println("1. Method Overloading");
        System.out.println("   -> Compile Time Polymorphism");
        System.out.println("   -> Static Polymorphism");
        System.out.println("   -> Early Binding");
        System.out.println("   -> Static Binding");

        System.out.println();
        System.out.println("2. Method Overriding");
        System.out.println("   -> Runtime Polymorphism");
        System.out.println("   -> Dynamic Polymorphism");
        System.out.println("   -> Runtime Binding");
        System.out.println("   -> Dynamic Binding");
        System.out.println("   -> Late Binding");

        System.out.println();
        System.out.println("3. Upcasting");
        System.out.println("   Employee emp = new TechEmp();");

        System.out.println();
        System.out.println("4. Downcasting");
        System.out.println("   TechEmp te = (TechEmp) emp;");

        System.out.println();
        System.out.println("5. Invalid Downcasting");
        System.out.println("   Causes ClassCastException");
    }
}