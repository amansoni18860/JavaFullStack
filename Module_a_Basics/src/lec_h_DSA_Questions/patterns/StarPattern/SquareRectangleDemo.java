package lec_h_DSA_Questions.patterns.StarPattern;

import java.util.Scanner;

public class SquareRectangleDemo {

    // Prints star rectangle
    public static void printStarRectangle(Scanner sc) {

        System.out.print("Enter number of rows and columns: ");

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Prints star square
    public static void printStarSquare(Scanner sc) {

        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Prints hollow rectangle or square
    public static void printHollowRectangle(Scanner sc) {

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    // Prints plus sign pattern
    public static void printPlusSign(Scanner sc) {

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int middle = size / 2;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (i == middle || j == middle) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    // Prints X pattern
    public static void printXPattern(Scanner sc) {

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (i == j || (i + j) == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    // Displays menu
    public static void displayMenu() {

        System.out.println("\n===== Square & Rectangle Pattern Menu =====");
        System.out.println("1. Star Rectangle");
        System.out.println("2. Star Square");
        System.out.println("3. Hollow Rectangle");
        System.out.println("4. Plus Sign");
        System.out.println("5. X Pattern");
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
                    printStarRectangle(sc);
                    break;

                case 2:
                    printStarSquare(sc);
                    break;

                case 3:
                    printHollowRectangle(sc);
                    break;

                case 4:
                    printPlusSign(sc);
                    break;

                case 5:
                    printXPattern(sc);
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