package lect_f_PrimitiveTypeFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperators {

    public static void main(String[] args) {

        /*
         * BinaryOperator<T>
         * Takes two arguments of the same type and
         * returns a result of the same type.
         *
         * Here:
         * Input 1 : String
         * Input 2 : String
         * Output  : String
         */
        BinaryOperator<String> b = (s1, s2) -> s1 + s2;

        // Concatenates two strings
        System.out.println(b.apply("raj", "singhaniya"));

        /*
         * IntBinaryOperator
         * Primitive specialization of BinaryOperator<Integer>.
         *
         * Takes two int values and returns an int value.
         * Avoids boxing and unboxing overhead.
         */
        IntBinaryOperator b2 = (i1, i2) -> i1 + i2;

        // Adds two numbers
        System.out.println(b2.applyAsInt(10, 20));

        // Adds another pair of numbers
        System.out.println(b2.applyAsInt(100, 20));
    }
}