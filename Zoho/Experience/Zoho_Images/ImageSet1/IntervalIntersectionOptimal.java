package Zoho.Experience.Zoho_Images.ImageSet1;
/*
Example Run

Input:

4
1 6
2 8
3 10
5 8


Output:

[5,6]
 */
import java.util.*;

public class IntervalIntersectionOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("no of interval ");
        int n = sc.nextInt(); // number of intervals
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int maxLeft = Integer.MIN_VALUE;
        int minRight = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            maxLeft = Math.max(maxLeft, arr[i][0]);
            minRight = Math.min(minRight, arr[i][1]);
        }

        if (maxLeft <= minRight) {
            System.out.println("[" + maxLeft + "," + minRight + "]");
        } else {
            System.out.println("-1");
        }
    }
}
