package GitHub_pradeep;
import java.util.*;
public class No_01_GreaterOnRight {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

            int maxRight = -1; // last element replacement
            for (int i = N - 1; i >= 0; i--) {
                int temp = arr[i];
                arr[i] = maxRight;
                if (temp > maxRight) maxRight = temp;
            }

            for (int x : arr) System.out.print(x + " ");
        }
    }


