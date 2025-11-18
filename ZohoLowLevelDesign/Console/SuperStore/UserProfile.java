package ZohoLowLevelDesign.Console.SuperStore;
import java.security.MessageDigest;
import java.util.Base64;

public class UserProfile {
    String name;
    String email;
    String passwordHash;
    String role;

    public UserProfile(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.passwordHash = hashPassword(password);
        this.role = role;
    }

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hash); // convert to string
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkPassword(String password) {

        return hashPassword(password).equals(this.passwordHash);
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }


}
