package ZohoLowLevelDesign.Low_Level_Design.Taxi_Booking_System;
import java.util.*;
public class TaxiSystem {
    List<Taxi>taxiList=new ArrayList<>();
    int customerCount=1;
    int bookingCount=1;

    public void initializeTaxi(int count)
    {
        for(int i=1;i<=count;i++)
        {
            taxiList.add(new Taxi(i));
        }
    }

    public void bookTaxi(Scanner in)
    {
        int customerId=customerCount++;

        System.out.println("Enter pickUp (A-F)");
        char pickup = in.next().toUpperCase().charAt(0);
        if (pickup < 'A' || pickup > 'F') {
            System.out.println("❌ Invalid pickup point! Please choose between A-F.");
            return;
        }

        System.out.println("Enter Drop (A-F)");
        char drop = in.next().toUpperCase().charAt(0);
        if (drop < 'A' || drop > 'F') {
            System.out.println("❌ Invalid drop point! Please choose between A-F.");
            return;
        }


        System.out.print("Enter pickup time (1-12): ");
        int pickupTime = in.nextInt();

        Taxi  choose=null;
        int minDistance=Integer.MAX_VALUE;
        for(Taxi taxi :taxiList){
            int distance=Math.abs(taxi.currentLocation-pickup);
            if(distance<minDistance ||
            distance==minDistance &&
            taxi.money<
            (choose!=null ? choose.money :Integer.MAX_VALUE)){
            choose=taxi;
            minDistance=distance;
            }
        }

        if(choose==null){
            System.out.println("NO taxi is available");
            return;
        }

        int distanceUnit=Math.abs(pickup-drop);
        int dropTime=pickupTime+distanceUnit;
        int fare=choose.calculateMoney(pickup,drop);

        TaxiBook booking=new TaxiBook(
                bookingCount++,customerId,pickupTime,dropTime,pickup,drop,fare
        );
        choose.addBooking(booking);
        System.out.println("Taxi "+choose.taxiId+ "Booked success "+customerId+ "Fare "+fare);



    }

    public void display()
    {
        for(Taxi taxies:taxiList){
            taxies.display();
        }
    }


}
