package Arrays_Sorting;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr1 = {8, 4, 6, 5, 1, 3};

        int[] arr2 = {8, 4, 6, 5, 1, 3};

/*
[1, 3, 7, 9, 8, 2]   // Ascending odd, descending even
[2, 8, 9, 7, 3, 1]   // Ascending even, descending odd

 */
        ascendingOddDescendingEven(arr1);
        ascendingEvenDescendingOdd(arr2);
    }

    // Ascending odd, descending even
    public static void ascendingOddDescendingEven(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Both odd → ascending
                if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
                // Both even → descending
                else if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
                // Odd before even → swap if even comes first
                else if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Ascending even, descending odd
    public static void ascendingEvenDescendingOdd(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Both even → ascending
                if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
                // Both odd → descending
                else if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
                // Even before odd → swap if odd comes first
                else if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    swap(arr, i, j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
