package Number_Crunching;
import java.util.*;

public class consecutive_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 2; // You can take input if needed
        System.out.println("Enter a number:");
        int n = in.nextInt();

        String x = String.valueOf(n);
        boolean found = false;

        for (int i = 0; i <= x.length() - k; i++) {
            boolean allSame = true;
            for (int j = 1; j < k; j++) {
                if (x.charAt(i + j) != x.charAt(i)) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
