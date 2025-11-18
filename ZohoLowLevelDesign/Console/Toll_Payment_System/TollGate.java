package ZohoLowLevelDesign.Console.Toll_Payment_System;

import java.util.*;

public class TollGate {
    private int tollId;
    private String name;
    private Map<String, Double> tariff = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();

    public TollGate(int tollId, String name) {
        this.tollId = tollId;
        this.name = name;
    }

    public void setTariff(String vehicleType, double charge) {
        tariff.put(vehicleType, charge);
    }

    public double calculateCharge(Vehicle v) {
        double amount = tariff.getOrDefault(v.getType(), 0.0);
        if (v.isVIP()) amount *= 0.8; // 20% discount
        return amount;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactions() { return transactions; }

    public double getTotalCollected() {
        return transactions.stream().mapToDouble(Transaction::getAmountPaid).sum();
    }

    public String getName() { return name; }
}
