package ZohoLowLevelDesign.Low_Level_Design.Taxi_Booking_System;
import java.util.*;
public class Taxi {
    int taxiId;
    char currentLocation='A';
    int money=0;

    List<TaxiBook>booking=new ArrayList<>();

    public Taxi(int taxiId) {
        this.taxiId = taxiId;
    }

    public void addBooking(TaxiBook rideBook){
     booking.add(rideBook);
     money+=rideBook.earning;
     currentLocation=rideBook.endPoint;

    }

    public boolean isAvailable(int requestTime){
        if(booking.isEmpty()) return true;
        TaxiBook lastBook=booking.get(booking.size()-1);
        return lastBook.dropTime<=requestTime;
    }

    public int calculateMoney(char from , char to)
    {
        int distance=Math.abs(to-from)*15;
        return 100 /* basic fare */ +Math.max(0,(distance-5)*10);
    }

    public void display()
    {
        System.out.println("Taxi - "+taxiId+" current Location " +currentLocation+" Total Earning "+money);
        for(TaxiBook ride :booking){
            System.out.println(" Booking Id: "+ride.bookingId+
            " | Customer Id: "+ride.customerId+
            " | From: "+ride.startPoint +
            " | To "+ride.endPoint+
            " | PickUP: "+ride.pickupTime+
            " | Drop : "+ride.dropTime+
            " | Fare :"+ride.earning);

        }

    }
}
