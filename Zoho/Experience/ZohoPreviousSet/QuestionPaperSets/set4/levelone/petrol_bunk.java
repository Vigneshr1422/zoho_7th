package set4.levelone;
import java.util.*;

public class petrol_bunk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Initial petrol
        System.out.println("Enter petrol in car: ");
        int petrolInCar = in.nextInt();

        // Number of bunks
        System.out.println("Enter number of bunks: ");
        int n = in.nextInt();

        int[] distance = new int[n];
        int[] capacity = new int[n];

        // Distances
        System.out.println("Enter distances of bunks: ");
        for (int i = 0; i < n; i++) {
            distance[i] = in.nextInt();
        }

        // Capacities
        System.out.println("Enter capacities of bunks: ");
        for (int i = 0; i < n; i++) {
            capacity[i] = in.nextInt();
        }

        int petrol = petrolInCar;

        for (int i = 0; i < n; i++) {
            petrol -= distance[i];   // consume petrol to reach bunk

            if (petrol < 0) {
                System.out.println("He cannot travel");
                return;
            }

            petrol += capacity[i];   // refill at bunk
        }

        System.out.println("Remaining petrol in car is " + petrol + " liters");
    }
}
