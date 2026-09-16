package lec_b_Constructors;

public class ConstructorChainingDemo {

    String name;
    int age;

    ConstructorChainingDemo() {
        this("Unknown");
        System.out.println("Default Constructor");
    }

    ConstructorChainingDemo(String name) {
        this(name, 0);
        System.out.println("One Parameter Constructor");
    }

    ConstructorChainingDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two Parameter Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ConstructorChainingDemo obj =
                new ConstructorChainingDemo();

        obj.display();

        System.out.println();

        ConstructorChainingDemo obj2 =
                new ConstructorChainingDemo("Aman");

        obj2.display();

        System.out.println();

        ConstructorChainingDemo obj3 =
                new ConstructorChainingDemo("Rahul", 25);

        obj3.display();
    }
}