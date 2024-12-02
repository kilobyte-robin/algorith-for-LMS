public class Book {

    private int bookId;
    private String title;
    private String genre;
    private String author;
    private String availability;
    private String dateBorrowed;
    private String dateReturned;
    private String image;
    private String status;


    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + availability);
        System.out.println("Date Borrowed: " + dateBorrowed);
        System.out.println("Date Returned: " + dateReturned);
        System.out.println("Status: " + status);
    }

    public boolean updateStatus(String newStatus) {
        return Database.updateBookStatus(bookId, newStatus);
    }
}