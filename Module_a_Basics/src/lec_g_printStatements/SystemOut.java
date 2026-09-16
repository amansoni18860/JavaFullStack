package lec_g_printStatements;

public class SystemOut {

    public static void main(String[] args) {

        // print()
        System.out.print("Hello ");
        System.out.print("World");
        System.out.print("\n");

        // println()
        System.out.println("Java");
        System.out.println("Programming");

        // printf()
        String name = "Aman";
        int age = 22;
        double salary = 50000.75;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Salary: %.2f%n", salary);

        // format()
        System.out.format("Name: %s Age: %d%n", name, age);

        // escape sequences
        System.out.println("Line 1\nLine 2");
        System.out.println("Java\tProgramming");
        System.out.println("\"Hello World\"");
        System.out.println("C:\\Users\\Aman");

        // concatenation
        int a = 10;
        int b = 20;

        System.out.println("Sum = " + (a + b));

        // formatted numbers
        double pi = 3.1415926535;

        System.out.printf("PI = %.2f%n", pi);
        System.out.printf("PI = %.4f%n", pi);

        // multiple values
        System.out.printf("a = %d, b = %d, Sum = %d%n", a, b, a + b);
    }
}