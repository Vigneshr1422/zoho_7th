package ZohoLowLevelDesign.Low_Level_Design.Taxi_Booking_System;

public class TaxiBook {
    int bookingId;
    int customerId;
    int pickupTime;
    int dropTime;
    char startPoint;
    char endPoint;
    int earning;

    public TaxiBook(int bookingId, int customerId, int pickupTime, int dropTime, char startPoint, char endPoint, int earning) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.earning = earning;
    }
}
