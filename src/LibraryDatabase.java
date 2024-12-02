import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
    private final List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void delete(int bookId) {
        books.removeIf(book -> book.bookId == bookId);
        System.out.println("Book removed with ID: " + bookId);
    }

    public void update(Book updatedBook) {
        for (Book book : books) {
            if (book.bookId == updatedBook.bookId) {
                book.title = updatedBook.title;
                book.genre = updatedBook.genre;
                book.author = updatedBook.author;
                System.out.println("Book updated: " + book.title);
                break;
            }
        }
    }

    public void search(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.displayBook();
            }
        }
    }

    public void display() {
        for (Book book : books) {
            book.displayBook();
        }
    }

    public boolean updateBookStatus(int bookId, boolean isBorrowed) {
        for (Book book : books) {
            if (book.bookId == bookId) {
                book.updateBookStatus(isBorrowed);
                return true;
            }
        }
        return false;
    }
}