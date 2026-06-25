class User {
    private final String username;
    private final String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public String getUsername(){ return username; }
    public String getEmail(){ return email; }
}

class EmailValidator {
    public static boolean isValid(String email) {
        if (email != null && email.contains("@")) {
            return true;
        }
        System.out.println("Invalid email format. ");
        return false;
    }
}

class UserRespitory {
    public void save(User user) {
        if (EmailValidator.isValid(user.getEmail())) {
            System.out.println("Connecting to database...");
            System.out.println("Saving user " + user.getUsername() + " to the users table.");
        } else {
            System.out.println("Failed to save user due validation error.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UserRespitory userRespitory = new UserRespitory();

        System.out.println("--- Testing valid User ---");
        User validUser = new User("alice-dev", "alice@example.com");
        userRespitory.save(validUser);

        System.out.println("\n--- Testing invalid user---");
        User invalidUser = new User("bob_broken", "dbob_at_example.com");
        userRespitory.save(invalidUser);

    }
}
