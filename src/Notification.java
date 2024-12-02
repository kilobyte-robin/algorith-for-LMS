import java.time.LocalDate;

public class Notification {
    private int notificationID;
    private LocalDate createdOn;
    private String content;

    public Notification(String content) {
        this.content = content;
        this.createdOn = LocalDate.now();
    }

    public boolean sendNotification() {
        System.out.println("Notification Sent: " + content);
        return true;
    }
}
