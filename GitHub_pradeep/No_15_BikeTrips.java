package GitHub_pradeep;


import java.util.Scanner;

public class No_15_BikeTrips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of persons:");
        int n = sc.nextInt();
        int[] persons = new int[n];
        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) {
            persons[i] = sc.nextInt();
        }
        System.out.println("Enter max weight K:");
        int K = sc.nextInt();

        // Sort manually (ascending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (persons[i] > persons[j]) {
                    int temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }

        int trips = 0;
        int i = 0;           // lightest
        int j = n - 1;       // heaviest

        while (i <= j) {
            if (persons[i] + persons[j] <= K) {
                i++;  // lightest person can share
            }
            j--;  // heaviest always goes
            trips++;
        }

        System.out.println("Minimum trips: " + trips);
    }
}
