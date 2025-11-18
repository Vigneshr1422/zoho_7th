package ZohoLowLevelDesign.Console.Toll_Payment_System;

import java.util.*;

public class Highway {
    private int n; // number of points
    private Map<Integer, TollGate> tolls = new HashMap<>();

    public Highway(int n) { this.n = n; }

    public void addToll(int point, TollGate toll) {
        tolls.put(point, toll);
    }

    public List<TollGate> findRoute(int start, int dest) {
        List<TollGate> route = new ArrayList<>();
        for (int i = start; i != dest; i = (i + 1) % n) {
            if (tolls.containsKey(i)) route.add(tolls.get(i));
        }
        if (tolls.containsKey(dest)) route.add(tolls.get(dest));
        return route;
    }

    public List<TollGate> findShortestCircularRoute(int start, int dest) {
        int clockwise = (dest - start + n) % n;
        int counter = (start - dest + n) % n;
        List<TollGate> route1 = findRoute(start, dest);
        List<TollGate> route2 = findRoute(dest, start);
        return (clockwise <= counter) ? route1 : route2;
    }
}

