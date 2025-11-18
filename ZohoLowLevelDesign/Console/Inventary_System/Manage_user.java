package ZohoLowLevelDesign.Console.Inventary_System;

import java.util.*;

public class Manage_user {
    private List<user> users = new ArrayList<>();

    // Sign up (Register New User)
    public boolean signUp(String name, String password, String role) {
        user existing = verify(name);
        if (existing != null) {
            return false; // Already exists
        }
        users.add(new user(name, password, role));
        return true;
    }

    // Sign in (Return user object if credentials match)
    public user signIn(String name, String password) {
        for (user u : users) {
            if (u.getName().equals(name) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    private user verify(String name) {
        for (user u : users) {
            if (u.getName().equals(name)) return u;
        }
        return null;
    }
}
