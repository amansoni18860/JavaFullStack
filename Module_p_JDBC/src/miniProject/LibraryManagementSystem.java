package miniProject;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("==================================");
        System.out.println(" LIBRARY MANAGEMENT SYSTEM ");
        System.out.println("==================================");

        do {

            System.out.println("\nMenu:");
            System.out.println("1. Add Author");
            System.out.println("2. Update Author");
            System.out.println("3. Delete Author");
            System.out.println("4. List All Authors");
            System.out.println("5. Add Book");
            System.out.println("6. Update Book");
            System.out.println("7. Delete Book");
            System.out.println("8. List All Books");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Author Name: ");
                    String authorName = scanner.nextLine();

                    Author.addAuthor(authorName);
                    break;

                case 2:

                    System.out.print("Enter Author ID: ");
                    int authorId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Author Name: ");
                    String newAuthorName = scanner.nextLine();

                    Author.updateAuthor(authorId, newAuthorName);
                    break;

                case 3:

                    System.out.print("Enter Author ID to Delete: ");
                    int deleteAuthorId = scanner.nextInt();

                    Author.deleteAuthor(deleteAuthorId);
                    break;

                case 4:

                    Author.displayAuthors();
                    break;

                case 5:

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author ID: ");
                    int bookAuthorId = scanner.nextInt();

                    Book.addBook(title, bookAuthorId);
                    break;

                case 6:

                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Book Title: ");
                    String newTitle = scanner.nextLine();

                    System.out.print("Enter New Author ID: ");
                    int newAuthorId = scanner.nextInt();

                    Book.updateBook(bookId, newTitle, newAuthorId);
                    break;

                case 7:

                    System.out.print("Enter Book ID to Delete: ");
                    int deleteBookId = scanner.nextInt();

                    Book.deleteBook(deleteBookId);
                    break;

                case 8:

                    Book.displayBooks();
                    break;

                case 9:

                    System.out.println("Exiting Library Management System...");
                    break;

                default:

                    System.out.println("Invalid Choice. Try Again.");
            }

        } while (choice != 9);

        scanner.close();
    }
}