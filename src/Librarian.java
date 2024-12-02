public class Librarian extends Customer {
    // Additional Methods for Librarian
    public boolean addBook(String title, String genre, String author) {
        return Database.addBook(title, genre, author);
    }

    public boolean updateBook(int bookId, String title, String genre, String author) {
        return Database.updateBook(bookId, title, genre, author);
    }

    public boolean removeBook(int bookId) {
        return Database.removeBook(bookId);
    }

    public void searchBook(String keyword) {
        Database.searchBooks(keyword);
    }
}