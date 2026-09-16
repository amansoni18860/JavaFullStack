package lec_h_DSA_Questions.patterns.NumberPattern;

import java.util.Scanner;

public class NumberPatternDemo {

    // Number rectangle pattern
    public static void printNumberRectangle(Scanner sc) {

        System.out.print("Enter number of rows and columns: ");

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Number square pattern
    public static void printColumnNumberSquare(Scanner sc) {

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Row number square pattern
    public static void printRowNumberSquare(Scanner sc) {

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    // Increasing number triangle
    public static void printIncreasingNumberTriangle(Scanner sc) {

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    // Right aligned number triangle
    public static void printRightAlignedNumberTriangle(Scanner sc) {

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    // Menu
    public static void displayMenu() {

        System.out.println("\n===== Number Pattern Menu =====");
        System.out.println("1. Number Rectangle");
        System.out.println("2. Column Number Square");
        System.out.println("3. Row Number Square");
        System.out.println("4. Increasing Number Triangle");
        System.out.println("5. Right Aligned Number Triangle");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            displayMenu();
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:
                    printNumberRectangle(sc);
                    break;

                case 2:
                    printColumnNumberSquare(sc);
                    break;

                case 3:
                    printRowNumberSquare(sc);
                    break;

                case 4:
                    printIncreasingNumberTriangle(sc);
                    break;

                case 5:
                    printRightAlignedNumberTriangle(sc);
                    break;

                case 6:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();

        } while (choice != 6);

        sc.close();
    }
}