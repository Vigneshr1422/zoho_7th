package ZohoLowLevelDesign.Low_Level_Design.Taxi_Booking_System;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TaxiSystem system=new TaxiSystem();
        Scanner in=new Scanner(System.in);

        System.out.println("Enter no of taxis ");
        int n=in.nextInt();

        system.initializeTaxi(n);

        while(true)
        {
            System.out.println("\n1. Book Taxi\n2. Display Taxis\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice){
                case 1: system.bookTaxi(in);
                break;
                case 2:system.display();
                break;
                case 3:{
                    System.out.println("Velila poda naaye ");
                    return;
                }

                default:
                    System.out.println("Invalid choice");
                    return;
            }
        }
    }
}
