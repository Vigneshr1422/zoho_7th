package GitHub_pradeep;
import java.util.*;
public class No_53_topThree {
   public static void main(String[] args) {
            int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
            int n = arr.length;

            // Step 1: Sort array
            Arrays.sort(arr);

            // Step 2: Initialize top 3
            int top1 = -1, top2 = -1, top3 = -1;
            int f1 = 0, f2 = 0, f3 = 0;

            int i = 0;
            while (i < n) {
                int current = arr[i];
                int count = 0;
                while (i < n && arr[i] == current) {
                    count++;
                    i++;
                }

                // Step 3: Update top 3
                if (count > f1) {
                    f3 = f2; top3 = top2;
                    f2 = f1; top2 = top1;
                    f1 = count; top1 = current;
                } else if (count > f2) {
                    f3 = f2; top3 = top2;
                    f2 = count; top2 = current;
                } else if (count > f3) {
                    f3 = count; top3 = current;
                }
            }

            System.out.print("Top 3 repeated numbers: ");
            System.out.print(top1);
            if (top2 != -1) System.out.print(", " + top2);
            if (top3 != -1) System.out.print(", " + top3);
        }
    }