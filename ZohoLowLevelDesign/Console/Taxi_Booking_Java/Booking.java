package ZohoLowLevelDesign.Console.Taxi_Booking_Java;

public class Booking {
    int bookingId;
    int customerId;
    int pickupTime;
    int dropTime;
    int amount;
    char pickupPoint;
    char dropPoint;

    public Booking(int bookingId, int customerId, int pickupTime, int dropTime, int amount, char pickupPoint, char dropPoint) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.amount = amount;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
    }
}
