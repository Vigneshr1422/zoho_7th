package ZohoLowLevelDesign.Console.Taxi_Booking_Java;

import java.util.*;

public class Taxi {
    int taxiId;
    char currentLocation = 'A'; // Default starting point
    int totalEarning = 0;
    List<Booking> bookings = new ArrayList<>();

    public Taxi(int id) {
        this.taxiId = id;
    }

    // Check if taxi is free at requested time
    public boolean isAvailable(int requestedTime) {
        if (bookings.isEmpty()) return true;

        Booking lastBooking = bookings.get(bookings.size() - 1);
        return lastBooking.dropTime <= requestedTime;
    }

    // Calculate fare: ₹100 base fare for first 5 km, ₹10/km after
    public int calculateFare(char from, char to) {
        int distance = Math.abs(to - from) * 15; // Each unit is 15km
        return 100 + Math.max(0, (distance - 5) * 10);
    }

    // Add new booking to taxi and update earnings
    public void addBooking(Booking booking) {
        bookings.add(booking);
        totalEarning += booking.amount;
        currentLocation = booking.dropPoint;
    }

    public void displayTaxiDetails() {
        System.out.println("Taxi-" + taxiId + " | Current Location: " + currentLocation + " | Total Earning: ₹" + totalEarning);
        for (Booking b : bookings) {
            System.out.println("  BookingID: " + b.bookingId +
                    " | CustomerID: " + b.customerId +
                    " | From: " + b.pickupPoint +
                    " | To: " + b.dropPoint +
                    " | Pickup: " + b.pickupTime +
                    " | Drop: " + b.dropTime +
                    " | Fare: ₹" + b.amount);
        }
    }
}
