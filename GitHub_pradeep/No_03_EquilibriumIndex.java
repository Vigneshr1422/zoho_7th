package GitHub_pradeep;
import java.util.*;
public class No_03_EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int totalSum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum -= arr[i]; // right sum
            if (leftSum == totalSum) {
                System.out.println(i);
                return;
            }
            leftSum += arr[i];
        }

        System.out.println(-1); // no equilibrium index
    }
}
