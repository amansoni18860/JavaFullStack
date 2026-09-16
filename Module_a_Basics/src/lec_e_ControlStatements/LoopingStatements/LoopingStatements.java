package lec_e_ControlStatements.LoopingStatements;

public class LoopingStatements {

    public static void main(String[] args) {

        // while loop
        int i = 1;

        while (i <= 5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        // do-while loop
        int j = 1;

        do {
            System.out.println("Do While Loop: " + j);
            j++;
        } while (j <= 5);

        // for loop
        for (int k = 1; k <= 5; k++) {
            System.out.println("For Loop: " + k);
        }

        // enhanced for loop (for-each)
        int[] arr = {10, 20, 30, 40, 50};

        for (int num : arr) {
            System.out.println("For Each Loop: " + num);
        }

        // nested loop
        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}