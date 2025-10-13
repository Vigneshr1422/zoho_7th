package Pdf110;

import java.util.Arrays;

public class No_106_Alternative_sort {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int res[]=new int[arr.length];
        int j=0;
        int n=arr.length;
        int s=0;
        int e=n-1;
    for(int i=0;i<n;i++)
        {
            if(j<n)
            {
                res[j++]=arr[e--];
            }
            if(j<n)
            {
                res[j++]=arr[s++];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

/*
import java.util.Arrays;

public class AlternativeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;

        int max_idx = n - 1;
        int min_idx = 0;
        int max_elem = arr[n-1] + 1; // max element +1

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // place max at even index
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            } else {
                // place min at odd index
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        // Divide by max_elem to get final values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max_elem;
        }

        System.out.println(Arrays.toString(arr));
    }
}

 */
