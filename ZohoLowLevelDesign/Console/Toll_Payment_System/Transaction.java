package ZohoLowLevelDesign.Console.Toll_Payment_System;

public class Transaction {
    private Vehicle vehicle;
    private TollGate toll;
    private double amountPaid;

    public Transaction(Vehicle vehicle, TollGate toll, double amountPaid) {
        this.vehicle = vehicle;
        this.toll = toll;
        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() { return amountPaid; }

    public String getDetails() {
        return vehicle.getVehicleNumber() + " paid " + amountPaid + " at " + toll.getName();
    }
}
