public class LibraryManagementSystem {
    private int id;
    private String name;
    private String userName;
    private String password;
    private int phoneNum;
    private String emailId;

    public boolean sendNotification(String content) {
        Notification notification = new Notification(content);
        return notification.sendNotification();
    }

    public boolean login(String username, String password) {
        // Dummy login logic (replace with DB verification)
        return this.userName.equals(username) && this.password.equals(password);
    }

    public void logout() {
        System.out.println("Logged out successfully.");
    }
}