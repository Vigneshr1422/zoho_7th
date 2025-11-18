package Zoho.Pdf110;

import java.util.Arrays;

public class No_04_ArrayIncrement {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 8};

        int[] ans = new int[arr.length];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
               if(i+1<arr.length && arr[i]==arr[i+1]){
                   ans[index++]=arr[i]*2;
                   i++;
               }else {
                   ans[index++]=arr[i];
               }
            }
        }
        System.out.println(Arrays.toString(ans));

    }

    public static void optimal()
    {
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 8};

        int n = arr.length;

        // Step 1: merge equal adjacent elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;  // remove merged one
            }
        }

        // Step 2: shift non-zero elements to left
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 3: fill remaining with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

}
