public class Customer {

    private int userId;
    private String name;
    private String username;
    private String password;
    private int idNumber;
    private String status;
    private int booksBorrowed;
    private int booksReturned;
    private int booksOverdue;


    public boolean searchBook(String keyword) {
        return Database.searchBooks(keyword);
    }

    public boolean issueBook(int bookId) {
        return Database.issueBook(bookId, userId);
    }

    public boolean reserveBook(int bookId) {
        return Database.reserveBook(bookId, userId);
    }

    public boolean renewBook(int bookId) {
        return Database.renewBook(bookId, userId);
    }

    public boolean returnBook(int bookId) {
        return Database.returnBook(bookId, userId);
    }

    public boolean payFine(double amount) {
        return Database.payFine(userId, amount);
    }

    public void viewBorrowedBooks() {
        Database.displayUserBorrowedBooks(userId);
    }
}