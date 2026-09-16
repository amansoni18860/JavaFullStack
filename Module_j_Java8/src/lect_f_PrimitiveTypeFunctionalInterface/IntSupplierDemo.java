package lect_f_PrimitiveTypeFunctionalInterface;

import java.util.function.IntSupplier;

public class IntSupplierDemo {

    public static void main(String[] args) {

        // Variable to store the generated OTP
        String otp = "";

        /*
         * IntSupplier is a primitive functional interface.
         * It supplies an int value and does not take any input.
         *
         * Math.random() generates a double value between 0.0 and 1.0
         * Multiplying by 10 gives values between 0.0 and 9.999...
         * Casting to int removes the decimal part, resulting in digits 0-9.
         */
        IntSupplier s = () -> (int) (Math.random() * 10);

        // Loop runs 6 times to generate a 6-digit OTP
        for (int i = 0; i < 6; i++) {

            // Generate a random digit and append it to the OTP string
            otp = otp + s.getAsInt();
        }

        // Display the generated OTP
        System.out.println("The 6 digit OTP : " + otp);
    }
}