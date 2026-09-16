package lec_d_StaticKeyword;

public class StaticDemo {

    String name;              // Instance variable
    static String college;    // Static variable

    
    
    // Static block
    static {
        college = "ABC College";
        System.out.println("Static Block Executed");
    }

    StaticDemo(String name) {
        this.name = name;
    }

    // Static method
    // A static method cannot directly access non-static members.

    static void showCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {

        StaticDemo s1 = new StaticDemo("Aman");
        StaticDemo s2 = new StaticDemo("Rahul");

        s1.display();
        s2.display();

        System.out.println();

        StaticDemo.showCollege();
    }
}