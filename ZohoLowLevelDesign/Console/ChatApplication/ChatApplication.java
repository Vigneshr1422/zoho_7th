package ZohoLowLevelDesign.Console.ChatApplication;
import java.util.*;

public class ChatApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChatRoom chatRoom = new ChatRoom();

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter username: ");
            String name = sc.nextLine();
            chatRoom.addUser(name);
        }

        System.out.println("Chat started! (type '/exit' to leave or '/history' to view your messages)");

        while (true) {
            System.out.print("Enter username (to send or '/history'): ");
            String uname = sc.nextLine();

            if (uname.equalsIgnoreCase("/history")) {
                System.out.print("Enter username to view history: ");
                String viewUser = sc.nextLine();
                chatRoom.showUserMessages(viewUser);
                continue;
            }

            System.out.print("Enter message: ");
            String msg = sc.nextLine();

            chatRoom.sendMessage(uname, msg);

            if (chatRoom.allInactive()) {
                System.out.println("System: All users left, chat closed.");
                break;
            }
        }

        sc.close();
    }
}
