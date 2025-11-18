package ZohoLowLevelDesign.Console.ChatApplication;

import java.util.Date;

public class Message {
    private String sender;
    private String receiver; // null if broadcast
    private String content;
    private String timestamp;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = new Date().toString().substring(11, 19); // HH:mm:ss
    }

    @Override
    public String toString() {
        if (receiver == null) {
            return "[" + timestamp + "] " + sender + ": " + content;
        } else {
            return "[" + timestamp + "] " + sender + " -> " + receiver + ": " + content;
        }
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

}
