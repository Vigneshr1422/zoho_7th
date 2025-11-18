package ZohoLowLevelDesign.Console.Toll_Payment_System;

import java.util.*;

public class TollPaymentApp {
    public static void main(String[] args) {
        Highway highway = new Highway(6);

        TollGate t1 = new TollGate(1, "Toll A");
        t1.setTariff("Car", 50);
        t1.setTariff("Truck", 100);

        TollGate t3 = new TollGate(3, "Toll B");
        t3.setTariff("Car", 60);
        t3.setTariff("Truck", 120);

        highway.addToll(1, t1);
        highway.addToll(3, t3);

        Vehicle v1 = new Vehicle("TN01AB1234", "Car", true);

        List<TollGate> route = highway.findRoute(0, 4);
        Journey j1 = new Journey(0, 4, route, v1);
        v1.addJourney(j1);

        System.out.println("Total paid by " + v1.getVehicleNumber() + " = " + v1.getTotalPaid());
        System.out.println(j1.getDetails());

        System.out.println("Toll Report for " + t1.getName());
        for (Transaction tr : t1.getTransactions()) {
            System.out.println(tr.getDetails());
        }
    }
}
