package lec_e_ControlStatements.JumpingStatements;

public class JumpingStatements {

    public static void main(String[] args) {

        // break statement
        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println("Break Loop: " + i);
        }

        // continue statement
        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                continue;
            }

            System.out.println("Continue Loop: " + i);
        }

        System.out.println("Before return");

        // return statement
        if (true) {
            return;
        }

        System.out.println("After return");
    }
}