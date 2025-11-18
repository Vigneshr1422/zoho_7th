package ZohoLowLevelDesign.Console.ChatApplication;

public class User {
    private String name;
    private boolean active;

    public User(String name) {
        this.name = name;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        this.active = false;
    }
}

