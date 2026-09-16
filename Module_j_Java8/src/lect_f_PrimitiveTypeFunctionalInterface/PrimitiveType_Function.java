package lect_f_PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.IntToDoubleFunction;

public class PrimitiveType_Function {

    public static void main(String[] args) {

        /*
         * IntFunction<R>
         * Accepts an int and returns a value of type R.
         *
         * Here:
         * Input  : int
         * Output : Integer
         *
         * Returns square of the given number.
         */
        IntFunction<Integer> f = i -> i * i;

        System.out.println(f.apply(5));

        /*
         * ToIntFunction<T>
         * Accepts an object of type T and returns an int.
         *
         * Here:
         * Input  : String
         * Output : int
         *
         * Returns length of the string.
         */
        ToIntFunction<String> f2 = s -> s.length();

        System.out.println(f2.applyAsInt("ramesh"));

        /*
         * IntToDoubleFunction
         * Accepts an int and returns a double.
         *
         * Math.sqrt() returns the square root.
         */
        IntToDoubleFunction f3 = i -> Math.sqrt(i);

        System.out.println(f3.applyAsDouble(5));
    }
}