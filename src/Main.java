import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book Book = new Book("Goosebumps", "R.L Stine","978-0439568265", "Horror");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title \n");
        String title = scanner.nextLine();
        Book.setTitle(title);

        System.out.println("Please enter author's name \n");
        String author = scanner.nextLine();
        Book.setAuthor(author);

        System.out.println("Please enter ISBN \n");
        String ISBN = scanner.nextLine();
        Book.setISBN(ISBN);

        System.out.println("Please enter genre \n");
        String Genre = scanner.nextLine();
        Book.setGenre(Genre);
    }
}