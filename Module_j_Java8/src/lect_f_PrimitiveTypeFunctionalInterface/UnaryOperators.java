package lect_f_PrimitiveTypeFunctionalInterface;

import java.util.function.UnaryOperator;
import java.util.function.IntUnaryOperator;

public class UnaryOperators {

    public static void main(String[] args) {

        /*
         * UnaryOperator<T>
         * Takes one input and returns the same type of output.
         * Here Integer is both input and output type.
         *
         * Lambda: i -> i * i
         * Returns the square of the given number.
         */
        UnaryOperator<Integer> f = i -> i * i;

        // apply() is used to execute the UnaryOperator
        System.out.println(f.apply(6)); // 36

        /*
         * IntUnaryOperator
         * Primitive version of UnaryOperator<Integer>.
         * Takes an int and returns an int.
         * Avoids boxing and unboxing overhead.
         */
        IntUnaryOperator f2 = i -> i * i;

        // applyAsInt() is used to execute IntUnaryOperator
        System.out.println(f2.applyAsInt(10)); // 100
    }
}