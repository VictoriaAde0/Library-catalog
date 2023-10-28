import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LibraryCatalogue libraryCatalogue = new LibraryCatalogue();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Catalogue Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book");
            System.out.println("4. List Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Book book = new Book();


                    System.out.println("Please enter book title \n");
                    String title = scanner.nextLine();
                    book.setTitle(title);

                    System.out.println("Please enter author's name \n");
                    String author = scanner.nextLine();
                    book.setAuthor(author);

                    System.out.println("Please enter ISBN \n");
                    String ISBN = scanner.nextLine();
                    book.setISBN(ISBN);

                    System.out.println("Please enter genre \n");
                    String Genre = scanner.nextLine();
                    book.setGenre(Genre);

                    libraryCatalogue.addBook(book);
                    break;

                case 2:
                    System.out.println("Please enter the name of the book to be removed \n");
                    String bookName = scanner.nextLine();
                    libraryCatalogue.removeBook(bookName);
                    break;

                case 3:
                    System.out.println("Please enter the title of the book you want to find \n");
                    String bookTitle = scanner.nextLine();
                    Book bookInfo = libraryCatalogue.findBook(bookTitle);

                    System.out.println("Title: " + bookInfo.getTitle());
                    System.out.println("Author: " + bookInfo.getAuthor());
                    System.out.println("ISBN: " + bookInfo.getISBN());
                    System.out.println("Genre: " + bookInfo.getGenre());
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    libraryCatalogue.listBook();
                    break;

                case 5:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again \n");

                    break;
            }
        }


    }

}
