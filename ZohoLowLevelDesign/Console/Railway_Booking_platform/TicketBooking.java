package ZohoLowLevelDesign.Console.Railway_Booking_platform;
import java.util.*;
public class TicketBooking {
    public static void main(String[] args) {
    TicketSystem ob=new TicketSystem();
    Scanner in=new Scanner(System.in);

    while(true)
    {
        System.out.println("\n Railway Booking System : ");
        System.out.println("1. Book Ticket");
        System.out.println("2. Cancel Ticket");
        System.out.println("3. View confirm Ticket ");
        System.out.println("4. View Available Ticket ");
        System.out.println("5. View RAC Ticket");
        System.out.println("6. View Waiting list Ticket");
        System.out.println("7. Exit");
        System.out.println("Enter your choice ");
        int choice=in.nextInt();
        in.nextLine();
        switch (choice)
        {
            case 1:
                System.out.println("Enter Name: ");
                String name=in.nextLine();
                System.out.println("Enter Age ");
                int age=in.nextInt();
                in.nextLine();
                System.out.println("Enter Gender (male/female");
                String gender=in.nextLine();
                System.out.println("Enter Berth Preference (L/U/M)");
                String birthPre=in.nextLine();


                ob.bookTicket(name,age,gender,birthPre);
                break;
            case 2:
                System.out.println("Enter ticket ID to cancel ");
                String tid=in.nextLine();
                ob.cancelTicket(tid);
                break;
            case 3:
                ob.printBookTicket();
            case 4:
                ob.availableTicket();
                break;
            case 5:
                ob.racTicket();
                break;
            case 6:
                ob.WaitingListTicket();
                break;
            case 7:
                System.out.println("Exit bro ..");
                System.exit(0);
            default:
                System.out.println("Invalid ticket");
        }
    }

    }
}
