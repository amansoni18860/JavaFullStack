package lec_h_DSA_Questions.patterns.CharPattern;

import java.util.Scanner;

public class CharacterPatterDemo {

    // Prints rectangle pattern with increasing characters
    public static void printCharacterRectangle(Scanner sc) {
        System.out.print("Enter number of rows and columns: ");

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    // Prints square pattern with increasing characters
    public static void printCharacterSquareByColumn(Scanner sc) {
        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    // Prints square pattern with same character in each row
    public static void printCharacterSquareByRow(Scanner sc) {
        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print((char) ('A' + i) + " ");
            }
            System.out.println();
        }
    }

    // Prints character triangle
    public static void printCharacterTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    // Prints repeating character triangle
    public static void printRowCharacterTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i) + " ");
            }
            System.out.println();
        }
    }

    // Prints alternating number and character triangle
    public static void printAlternatingTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {

                if (i % 2 == 0) {
                    System.out.print((j + 1) + " ");
                } else {
                    System.out.print((char) ('A' + j) + " ");
                }
            }

            System.out.println();
        }
    }

    // Prints right aligned character triangle
    public static void printRightAlignedCharacterTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1) + " ");
            }

            System.out.println();
        }
    }

    // Displays menu
    public static void displayMenu() {
        System.out.println("\n===== Character Pattern Menu =====");
        System.out.println("1. Character Rectangle");
        System.out.println("2. Character Square By Column");
        System.out.println("3. Character Square By Row");
        System.out.println("4. Character Triangle");
        System.out.println("5. Row Character Triangle");
        System.out.println("6. Alternating Number Character Triangle");
        System.out.println("7. Right Aligned Character Triangle");
        System.out.println("8. Exit");
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
                    printCharacterRectangle(sc);
                    break;

                case 2:
                    printCharacterSquareByColumn(sc);
                    break;

                case 3:
                    printCharacterSquareByRow(sc);
                    break;

                case 4:
                    printCharacterTriangle(sc);
                    break;

                case 5:
                    printRowCharacterTriangle(sc);
                    break;

                case 6:
                    printAlternatingTriangle(sc);
                    break;

                case 7:
                    printRightAlignedCharacterTriangle(sc);
                    break;

                case 8:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();

        } while (choice != 8);

        sc.close();
    }
}