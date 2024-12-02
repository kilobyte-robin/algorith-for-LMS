public class LibraryManagementSystem {

    private int id;
    private String name;
    private String username;
    private String password;
    private String phoneNumber;
    private String email;

    public boolean registerUser(String name, String username, String password, String phoneNumber, String email) {
        // Validate inputs
        if (isValidEmail(email) && isValidPhone(phoneNumber)) {
            // Check if username already exists (Database)
            if (Database.checkUserExists(username)) {
                System.out.println("Username already exists.");
                return false;
            }
            // Register new user
            Database.addUser(name, username, password, phoneNumber, email);
            System.out.println("Registration successful.");
            return true;
        }
        System.out.println("Invalid input.");
        return false;
    }

    public boolean login(String username, String password) {
        // Validate credentials
        if (Database.validateUser(username, password)) {
            System.out.println("Login successful.");
            return true;
        }
        System.out.println("Invalid credentials.");
        return false;
    }

    public void logout() {
        System.out.println("Logged out successfully.");
    }

    public void sendNotification(int userId, String message) {
        String phoneNumber = Database.getUserPhoneNumber(userId);
        Notification.send(message, phoneNumber);
    }

    // Helper methods for validation
    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    private boolean isValidPhone(String phone) {
        return phone.matches("^\\d{10}$");
    }
}