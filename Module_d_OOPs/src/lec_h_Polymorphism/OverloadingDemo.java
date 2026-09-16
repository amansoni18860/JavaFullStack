package lec_h_Polymorphism;

/*
 * METHOD OVERLOADING
 *
 * Same method name
 * Different parameter list
 *
 * Also called:
 * 1. Compile Time Polymorphism
 * 2. Static Polymorphism
 * 3. Early Binding
 * 4. Static Binding
 *
 * Compiler decides which method to call.
 */

public class OverloadingDemo {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        OverloadingDemo obj = new OverloadingDemo();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10.5, 20.5));
    }
}