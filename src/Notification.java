import java.sql.Date;

public class Notification {

    private int notificationId;
    private Date createDate;
    private String content;


    public static void send(String message, String phoneNumber) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }

    public static double calculateFine(int overdueDays) {
        double finePerDay = 5.0;
        return overdueDays * finePerDay;
    }

    public static void sendOverdueNotification(int userId, int overdueDays) {
        String phoneNumber = Database.getUserPhoneNumber(userId);
        double fine = calculateFine(overdueDays);
        send("You have " + overdueDays + " overdue days. Total fine: $" + fine, phoneNumber);
    }
}