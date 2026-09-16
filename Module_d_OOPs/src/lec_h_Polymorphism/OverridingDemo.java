package lec_h_Polymorphism;

/*
 * METHOD OVERRIDING
 *
 * Same method signature
 * Parent class + Child class
 *
 * Also called:
 * 1. Runtime Polymorphism
 * 2. Dynamic Polymorphism
 * 3. Runtime Binding
 * 4. Dynamic Binding
 * 5. Late Binding
 *
 * JVM decides which method to execute at runtime.
 */

public class OverridingDemo {

    public static void main(String[] args) {

        TechEmp te = new TechEmp();

        te.work();
    }
}