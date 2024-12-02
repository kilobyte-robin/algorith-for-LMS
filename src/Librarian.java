public class Librarian {
    private int id;
    private String name;


    public void addBook(Book book) {
        LibraryDatabase db = new LibraryDatabase();
        db.add(book);
    }

    public void updateBook(Book book) {
        LibraryDatabase db = new LibraryDatabase();
        db.update(book);
    }

    public void removeBook(int bookId) {
        LibraryDatabase db = new LibraryDatabase();
        db.delete(bookId);
    }

    public void verifyMember(String userName) {
        System.out.println("Verifying customer: " + userName);
        // Add verification logic (DB check)
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

    public void logout() {
            System.out.println("Logged out successfully.");
        }
}
