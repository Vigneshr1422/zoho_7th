package GitHub_pradeep;

import java.util.*;

public class No_17_MaxDigitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int sum = 0;
            int prod = 1;
            int temp = num;

            if(temp == 0) {
                prod = 0;
            }

            while(temp > 0) {
                int d = temp % 10;
                sum += d;
                prod *= d;
                temp /= 10;
            }

            int max = Math.max(sum, prod);
            System.out.print(max + " ");
        }
    }
}
