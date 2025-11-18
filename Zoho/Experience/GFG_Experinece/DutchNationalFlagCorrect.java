package Zoho.Experience.GFG_Experinece;


import java.util.Arrays;

public class DutchNationalFlagCorrect {
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,0,2,1,0};
        dutchAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void dutchAlgo(int[] arr) {
        int start = 0, mid = 0, end = arr.length - 1;

        while (mid <= end) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
