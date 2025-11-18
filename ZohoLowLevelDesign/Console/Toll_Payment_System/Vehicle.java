package ZohoLowLevelDesign.Console.Toll_Payment_System;

import java.util.*;

public class Vehicle {
    private String vehicleNumber;
    private String type; // Car, Bus, Truck
    private boolean isVIP;
    private List<Journey> journeys = new ArrayList<>();
    private double totalPaid = 0;

    public Vehicle(String vehicleNumber, String type, boolean isVIP) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.isVIP = isVIP;
    }

    public String getType() { return type; }
    public String getVehicleNumber() { return vehicleNumber; }
    public boolean isVIP() { return isVIP; }

    public void addJourney(Journey j) {
        journeys.add(j);
        totalPaid += j.getAmountPaid();
    }

    public double getTotalPaid() { return totalPaid; }
    public List<Journey> getJourneys() { return journeys; }
}

