package Zoho.Experience.Zoho_Images.ImageSet1;
/*
 * Array size = 13  
Array = 1 2 3 4 5 6 7 8 9 10 11 12 13  
Gap = 3
Output:

scss
Copy code
35   (1 + 4 + 7 + 10 + 13)  
26   (2 + 5 + 8 + 11)  
17   (3 + 6 + 9 + 12)
 */
import java.util.*;

public class SubArraySumOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        System.out.println("Enter`");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Gap da ");
        int gap = sc.nextInt();

        int[] sums = new int[gap];

        for (int i = 0; i < n; i++) {
            sums[i % gap] += arr[i];
        }

        for (int val : sums) {
            System.out.println(val);
        }
    }
}

