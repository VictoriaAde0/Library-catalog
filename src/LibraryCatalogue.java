import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class LibraryCatalogue {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

//    public void  removeBook(Book book){
//        books.remove(book);
//    }
    public void removeBook(String title) {
        Book book = getBook(title);
        if (book == null) {
            System.out.println("Book with title" + title + "not found");
            return;
        }
        books.remove(book);


    }
////int bookIndex = getbookIndex(title);
//    if(bookIndex = getbookIndex)

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

//    public ArrayList<Book> listbook ();
    public void listBook() {
        for (Book book : books) {
            System.out.println("Title" + book.getTitle());
            System.out.println("Author" + book.getAuthor());
            System.out.println("ISBN" + book.getISBN());
            System.out.println("Genre" + book.getGenre());
            System.out.println();
        }

    }

    private Book getBook(String title) {
//       HashMap<String, Object> bookObject = new HashMap<String, Object>();
//         for(int i = 0; i <books.size(); i++){
//            if (books.get(i).getTitle().equals(title)){
//                bookObject.put("bookObject", books.get(i));
//                return;
//            }
//        }
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

}