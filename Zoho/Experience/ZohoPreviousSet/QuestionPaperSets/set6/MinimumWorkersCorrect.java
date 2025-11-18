package set6;
import java.util.*;

public class MinimumWorkersCorrect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of shifts: ");
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        System.out.println("Enter start and end times (HHMM format):");
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();

            start[i] = toMinutes(s);
            end[i] = toMinutes(e);

            // If end < start → shift crosses midnight
            if(end[i] <= start[i]){
                end[i] += 24*60; // add 24 hours in minutes
            }
        }
        sc.close();

        System.out.println("Minimum number of workers required: " + minWorkers(start, end));
    }

    // Convert HHMM to minutes
    public static int toMinutes(int hhmm){
        int hh = hhmm / 100;
        int mm = hhmm % 100;
        return hh*60 + mm;
    }

    public static int minWorkers(int[] start, int[] end){
        Arrays.sort(start);
        Arrays.sort(end);

        int workers = 0, maxWorkers = 0;
        int i = 0, j = 0;
        int n = start.length;

        while(i<n){
            if(start[i] < end[j]){
                workers++;
                if(workers > maxWorkers) maxWorkers = workers;
                i++;
            } else {
                workers--;
                j++;
            }
        }
        return maxWorkers;
    }
}

/*
 


import java.util.*;

public class MinimumWorkers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of shifts: ");
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        System.out.println("Enter start and end times (HHMM format):");
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();

            // If shift crosses midnight, adjust end time
            if (end[i] < start[i]) {
                end[i] += 2400;
            }
        }
        sc.close();

        System.out.println("Minimum number of workers required: " + minWorkers(start, end));
    }

    public static int minWorkers(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);

        int workers = 0, maxWorkers = 0;
        int i = 0, j = 0;
        int n = start.length;

        while (i < n) {
            if (start[i] < end[j]) { // New shift starts before previous ends → need a new worker
                workers++;
                maxWorkers = Math.max(maxWorkers, workers);
                i++;
            } else {                 // Shift ended → worker free
                workers--;
                j++;
            }
        }
        return maxWorkers;
    }
}

 */