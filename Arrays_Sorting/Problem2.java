package Arrays_Sorting;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 9, 1, 2};
        ascendingEvenDescendingOdd(arr);
    }

    // Function: Ascending even, descending odd
    public static void ascendingEvenDescendingOdd(int[] arr) {
        int n = arr.length;

        // Loop to compare each pair
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                // 1️⃣ Both even → sort ascending
                if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
                // 2️⃣ Both odd → sort descending
                else if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
                // 3️⃣ Odd before even → if even comes first, swap
                else if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    swap(arr, i, j);
                }
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Swap helper function to avoid repeated code
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
