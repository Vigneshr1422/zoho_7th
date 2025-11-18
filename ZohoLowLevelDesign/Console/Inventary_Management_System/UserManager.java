package ZohoLowLevelDesign.Console.Inventary_Management_System;
import java.util.*;
public class UserManager {
        List<User> users = new ArrayList<>();

        public boolean signUp(String username, String password, String role) {
            if (getUser(username) != null) return false;
            users.add(new User(username, password, role));
            return true;
        }

        public User login(String username, String password) {
            User u = getUser(username);
            if (u != null && u.getPassword().equals(password)) return u;
            return null;
        }

        private User getUser(String username) {
            for (User u : users) {
                if (u.getUsername().equals(username)) return u;
            }
            return null;
        }
}
