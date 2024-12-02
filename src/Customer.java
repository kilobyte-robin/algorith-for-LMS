public class Customer {
    private String userName;
    private String password;

    public boolean login(String userName, String password) {
        // Replace with DB check logic
        return this.userName.equals(userName) && this.password.equals(password);
    }

    public void searchBook(String title) {
        // Call to LibraryDatabase class to search
        LibraryDatabase db = new LibraryDatabase();
        db.search(title);
    }

    public boolean issueBook(int bookId) {
        LibraryDatabase db = new LibraryDatabase();
        return db.updateBookStatus(bookId, true); // Issue book
    }

    public boolean returnBook(int bookId) {
        LibraryDatabase db = new LibraryDatabase();
        return db.updateBookStatus(bookId, false); // Return book
    }
}