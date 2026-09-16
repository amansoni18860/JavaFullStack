package lec_b_Constructors;

public class ConstructorDemo {

    String name;
    int age;

    // Default Constructor
    ConstructorDemo() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ConstructorDemo obj1 = new ConstructorDemo();

        obj1.display();

        System.out.println();

        ConstructorDemo obj2 = new ConstructorDemo("Aman", 22);

        obj2.display();
    }
}