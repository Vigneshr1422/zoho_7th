package ZohoLowLevelDesign.Console.Toll_Payment_System;

import java.util.*;

public class Journey {
    private int start;
    private int destination;
    private List<TollGate> tollsPassed = new ArrayList<>();
    private double amountPaid;

    public Journey(int start, int destination, List<TollGate> tollsPassed, Vehicle v) {
        this.start = start;
        this.destination = destination;
        this.tollsPassed = tollsPassed;
        calculateJourneyFare(v);
    }

    private void calculateJourneyFare(Vehicle v) {
        for (TollGate toll : tollsPassed) {
            double fare = toll.calculateCharge(v);
            toll.addTransaction(new Transaction(v, toll, fare));
            amountPaid += fare;
        }
    }

    public double getAmountPaid() { return amountPaid; }

    public String getDetails() {
        return "Journey " + start + " -> " + destination + " | Amount: " + amountPaid;
    }
}
