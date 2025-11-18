package Zoho.Experience.Zoho_Images.ImageSet1;

public class locker {
    public static void main(String[] args) {
        int n=100;

        for(int i=1;i*i<=n;i++)
        {
            System.out.println(i*i+" ");
        }
    }
    public class LockerProblem {
    public static void main(String[] args) {
        int numberOfLockers = 100; // number of lockers and students
        boolean[] lockers = new boolean[numberOfLockers + 1]; 
        // false = closed, true = open

        // students toggling
        for (int i = 1; i <= numberOfLockers; i++) {       // student i
            for (int j = i; j <= numberOfLockers; j += i) { // locker j
                lockers[j] = !lockers[j]; // toggle
            }
        }

        // print results
        System.out.println("Open lockers:");
        for (int i = 1; i <= numberOfLockers; i++) {
            if (lockers[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Closed lockers:");
        for (int i = 1; i <= numberOfLockers; i++) {
            if (!lockers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

}
