public class Book {
    int bookId;
    String title;
    String genre;
    String author;

    public void displayBook() {
        System.out.println("ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Author: " + author);
    }

    public boolean updateBookStatus(boolean isBorrowed) {
        // Logic to update the status of the book (DB integration)
        return isBorrowed;
    }
}