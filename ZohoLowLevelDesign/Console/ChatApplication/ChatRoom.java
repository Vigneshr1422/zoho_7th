package ZohoLowLevelDesign.Console.ChatApplication;

import java.util.*;

public class ChatRoom {
    private Map<String, User> users = new HashMap<>();
    private List<Message> history = new ArrayList<>();

    public void addUser(String username) {

        users.put(username, new User(username));
    }

    public void sendMessage(String senderName, String msg) {
        User sender = users.get(senderName);

        if (sender == null || !sender.isActive()) {
            System.out.println("System: Invalid or inactive user!");
            return;
        }

        // Exit command
        if (msg.equalsIgnoreCase("/exit")) {
            sender.deactivate();
            System.out.println("System: " + senderName + " left the chat");
            return;
        }

        // Private message
        if (msg.startsWith("@")) {
            int space = msg.indexOf(" ");
            if (space != -1) {
                String toUser = msg.substring(1, space);
                String content = msg.substring(space + 1);

                User receiver = users.get(toUser);
                if (receiver != null && receiver.isActive()) {
                    Message m = new Message(senderName, toUser, content);
                    history.add(m);
                    System.out.println(m);
                } else {
                    System.out.println("System: user " + toUser + " not active!");
                }
            }
        } else {
            // Broadcast
            Message m = new Message(senderName, null, msg);
            history.add(m);
            System.out.println(m);
        }
    }

    public boolean allInactive() {
        for (User u : users.values()) {
            if (u.isActive()) return false;
        }
        return true;
    }

    // New Method: Show all messages for a specific user
    public void showUserMessages(String username) {
        System.out.println("------ Chat History for " + username + " ------");
        for (Message m : history) {
            if (username.equals(m.getSender()) || username.equals(m.getReceiver()) || m.getReceiver() == null) {
                System.out.println(m);
            }
        }
        System.out.println("-----------------------------------------");
    }
}
