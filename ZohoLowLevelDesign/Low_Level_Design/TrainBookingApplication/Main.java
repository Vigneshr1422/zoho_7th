package ZohoLowLevelDesign.Low_Level_Design.TrainBookingApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Train Booking System (A → B → C → D → E)");
        System.out.println(" Commands:");
        System.out.println(" book,<SRC>,<DST>,<COUNT>");
        System.out.println(" cancel,<PNR>,<COUNT>");
        System.out.println(" chart");
        System.out.println(" exit");
        System.out.println("-------------------------------------------");

        while (true) {
            System.out.print("\nEnter command: ");
            String cmd = sc.nextLine().trim();
            if (cmd.equalsIgnoreCase("exit")) {
                System.out.println("👋 Exiting...");
                break;
            }
            if (!cmd.isEmpty())
                system.processCommand(cmd);
        }

        sc.close();
    }
}
