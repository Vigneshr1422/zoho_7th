package ZohoLowLevelDesign.Console.Taxi_Booking_Java;

import java.util.*;

public class TaxiBookingSystem {

    static List<Taxi> taxiList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int customerIdCounter = 1;
    static int bookingIdCounter = 1;

    public static void main(String[] args) {
        System.out.println("Enter the number of taxis:");
        int numTaxis = scanner.nextInt();
        initializeTaxis(numTaxis);

        while (true) {
            System.out.println("\n1. Book Taxi\n2. Display Taxis\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTaxi();
                    break;
                case 2:
                    displayTaxiDetails();
                    break;
                case 3:
                    System.out.println("Thank you! Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Initialize taxis with IDs
    public static void initializeTaxis(int count) {
        for (int i = 1; i <= count; i++) {
            taxiList.add(new Taxi(i));
        }
    }

    // Handle booking logic
    public static void bookTaxi() {
        int customerId = customerIdCounter++;

        System.out.print("Enter pickup point (A-F): ");
        char pickupPoint = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter drop point (A-F): ");
        char dropPoint = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter pickup time (1-12): ");
        int pickupTime = scanner.nextInt();

        Taxi chosenTaxi = null;
        int minDistance = Integer.MAX_VALUE;

        for (Taxi taxi : taxiList) {
            if (taxi.isAvailable(pickupTime)) {
                int distance = Math.abs(taxi.currentLocation - pickupPoint);

                // If shorter distance OR same distance but lower earning
                if (distance < minDistance || (distance == minDistance && taxi.totalEarning < (chosenTaxi != null ? chosenTaxi.totalEarning : Integer.MAX_VALUE))) {
                    chosenTaxi = taxi;
                    minDistance = distance;
                }
            }
        }

        if (chosenTaxi == null) {
            System.out.println("Booking Rejected: No taxis available at this time.");
            return;
        }

        int distanceInUnits = Math.abs(dropPoint - pickupPoint);
        int dropTime = pickupTime + distanceInUnits; // 1 hour per unit
        int fare = chosenTaxi.calculateFare(pickupPoint, dropPoint);

        Booking booking = new Booking(bookingIdCounter++, customerId, pickupTime, dropTime, fare, pickupPoint, dropPoint);
        chosenTaxi.addBooking(booking);

        System.out.println("Taxi-" + chosenTaxi.taxiId + " booked successfully for Customer-" + customerId + " | Fare: ₹" + fare);
    }

    // Display all taxis and their booking histories
    public static void displayTaxiDetails() {
        for (Taxi taxi : taxiList) {
            taxi.displayTaxiDetails();
        }
    }
}
