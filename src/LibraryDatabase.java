public class LibraryDatabase {
    // CRUD Operations
    public static boolean addUser(String name, String username, String password, String phone, String email) {
        // Insert user into DB
    }

    public static boolean validateUser(String username, String password) {
        // Validate user credentials in DB
    }

    public static String getUserPhoneNumber(int userId) {
        // Query DB for user's phone number
    }

    public static boolean addBook(String title, String genre, String author) {
        // Insert book into DB
    }

    public static boolean updateBook(int bookId, String title, String genre, String author) {
        // Update book in DB
    }

    public static boolean removeBook(int bookId) {
        // Delete book from DB
    }

    public static boolean issueBook(int bookId, int userId) {
        // Mark book as issued in DB
    }

    public static boolean reserveBook(int bookId, int userId) {
        // Add reservation to DB
    }

    public static boolean returnBook(int bookId, int userId) {
        // Update book return status in DB
    }

    public static boolean payFine(int userId, double amount) {
        // Update fine payment in DB
    }

    public static void displayUserBorrowedBooks(int userId) {
        // Query and display borrowed books from DB
    }
}