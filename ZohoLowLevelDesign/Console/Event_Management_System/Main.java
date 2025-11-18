package ZohoLowLevelDesign.Console.Event_Management_System;
import java.util.*;
import java.time.*;
public class Main {
    private static boolean isAdmin=false;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        EventManager ev=new EventManager();

      final String  admin_username="Admin";
      final String password="123";

        System.out.println("Enter user name");
        String name=in.nextLine();

        System.out.println("Enter password ");
        String pass=in.nextLine();



        if(admin_username.equals(name) && password.equals(pass))
        {
            isAdmin=true;
            System.out.println("Logged as admin");
        }else
        {
            System.out.println("logged as User ");
        }

        while(true)
        {
            System.out.println("Event management System ");
            if(isAdmin)
            {
                System.out.println("1. Create Event" +
                        "\n2. Update Event" +
                        "\n3. Delete Event" +
                        "\n4. Add User");
            }

            System.out.println("5.Register for event"+"" +
                    "\n6.Cancel Event"+"" +
                    "\n7.View Event "+
                    "\n8.Exit");

            System.out.println("Choose option ");
            int option=in.nextInt();
            switch(option) {
                case 1:
                    if(isAdmin) {
                        System.out.println("Event ID: ");
                        int eid=in.nextInt();
                        in.nextLine();
                        System.out.println("Event Name: ");
                        String en=in.nextLine();
                        System.out.println("Event Date yyyy-mm-dd: ");
                        LocalDate ed=LocalDate.parse(in.nextLine());
                        System.out.println("Event Type: ");
                        String et=in.nextLine();
                        ev.createEvent(eid,en,ed,et);

                    } break;
                case 2:
                    if(isAdmin) {
                        System.out.println("Event ID: ");
                        int eid=in.nextInt();
                        in.nextLine();
                        System.out.println("New Event Name: ");
                        String en=in.nextLine();
                        System.out.println("New Event Date yyyy-mm-dd: ");
                        LocalDate ed=LocalDate.parse(in.nextLine());
                        System.out.println("New Event Type: ");
                        String et=in.nextLine();
                        ev.updateEvent(eid,en,ed,et);
                    } break;
                case 3:
                    if(isAdmin) {
                        System.out.println("Event ID: ");
                        int eid=in.nextInt();
                        in.nextLine();
                        ev.deleteEvent(eid);
                    } break;
                case 4:
                    if(isAdmin) {
                        System.out.println("User ID: ");
                        int uid=in.nextInt();
                        in.nextLine();
                        System.out.println("User Name: ");
                        String un=in.nextLine();
                        ev.addUser(uid,un);
                    } break;
                case 5:
                    System.out.println("User ID: ");
                    int uid=in.nextInt();
                    in.nextLine();
                    System.out.println("Event ID: ");
                    int eid=in.nextInt();
                    in.nextLine();
                    ev.registerEvent(uid,eid); break;
                case 6:
                    System.out.println("User ID: ");
                    int uuid=in.nextInt(); in.nextLine();
                    System.out.println("Event ID: ");
                    int eeid=in.nextInt(); in.nextLine();
                    ev.cancelEvent(uuid,eeid); break;
                case 7:
                    System.out.println("Event ID: ");
                    int eiid=in.nextInt(); in.nextLine();
                    ev.viewEvent(eiid); break;
                case 8:
                    System.out.println("Exiting.");
                    System.exit(0); break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println();
        }
    }
}
