package lec_d_Operators;

public class Operator {

    public static void main(String[] args) {

        String no1 = "526";
        String no2 = "10";

        int x = Integer.parseInt(no1);
        int y = Integer.parseInt(no2);

        // Arithmetic Operators
        System.out.println("Addition = " + (x + y));
        System.out.println("Subtraction = " + (x - y));
        System.out.println("Multiplication = " + (x * y));
        System.out.println("Division = " + (x / y));
        System.out.println("Modulus = " + (x % y));

        // Assignment Operators
        int k = 20;
        k += 5;
        System.out.println("k += 5 : " + k);

        k -= 3;
        System.out.println("k -= 3 : " + k);

        // Relational Operators
        System.out.println("x > y = " + (x > y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x == y = " + (x == y));
        System.out.println("x != y = " + (x != y));

        // Logical Operators
        System.out.println("(x > 100 && y > 5) = " + (x > 100 && y > 5));
        System.out.println("(x > 100 || y > 100) = " + (x > 100 || y > 100));
        System.out.println("!(x > y) = " + !(x > y));

        // Increment and Decrement
        int a = 5;
        System.out.println("a = " + a);
        System.out.println("a++ = " + a++);
        System.out.println("After a++ : " + a);

        System.out.println("++a = " + ++a);
        System.out.println("a-- = " + a--);
        System.out.println("After a-- : " + a);

        // Bitwise Operators
        int b = 4;
        int c = 3;

        System.out.println("b & c = " + (b & c));
        System.out.println("b | c = " + (b | c));
        System.out.println("b ^ c = " + (b ^ c));
        System.out.println("~b = " + (~b));

        // Shift Operators
        System.out.println("b << 1 = " + (b << 1));
        System.out.println("b << 2 = " + (b << 2));
        System.out.println("b >> 1 = " + (b >> 1));
        System.out.println("b >>> 1 = " + (b >>> 1));

        // Random Number
        int n = 1 + (int) (Math.random() * 100);
        System.out.println("\nGenerated Number = " + n);

        // Even/Odd
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");

        // Divisible by 3 and 7
        if (n % 3 == 0 && n % 7 == 0)
            System.out.println(n + " is divisible by 3 and 7");
        else
            System.out.println(n + " is not divisible by 3 and 7");

        // Ternary Operator
        String result = (n > 50) ? "Greater than 50" : "Less than or equal to 50";
        System.out.println(result);

        // Prime Number Check
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");

        // Swap Two Numbers
        int num1 = 15;
        int num2 = 25;

        System.out.println("\nBefore Swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Maximum of Two Numbers
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum = " + max);
    }
}