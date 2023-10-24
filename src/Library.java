import java.util.ArrayList;

public class Library {
    public ArrayList<Book> bookrecords = new ArrayList<>();
    public void  addBook(Book book){
        bookrecords.add(book);
    }

    public void removeBook(String title){
        for (Book book : bookrecords) {
            if (book.getTitle().equals(title)){
                bookrecords.remove(book);
                break;
            }
        }
    }

    public  Book findBook(String title) {
        for (Book book : bookrecords) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void listBook(){
        for (Book book : bookrecords){
            System.out.println("Title" + book.getTitle());
            System.out.println("Author" + book.getAuthor());
            System.out.println("ISBN" + book.getISBN());
            System.out.println("Genre" + book.getGenre());
        }

    }
}


