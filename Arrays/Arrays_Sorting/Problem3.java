//    package Arrays.Arrays_Sorting;
//    import java.util.*;
//    public class Problem3 {
//        public static void main(String[] args) {
//            int[] arr = {0,1,2,3,4,5,6,7};
//            alternateEvenOdd(arr);
//            System.out.println(Arrays.toString(arr));
//        }
//
//        public static void alternateEvenOdd(int[] arr) {
//            int n = arr.length;
//
//            // Nested loops: first loop for sorting evens and odds correctly in-place
//            for (int i = 0; i < n - 1; i++) {
//                for (int j = i + 1; j < n; j++) {
//                    // Both even → descending
//                    if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j]) {
//                        swap(arr, i, j);
//                    }
//                    // Both odd → ascending
//                    else if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] > arr[j]) {
//                        swap(arr, i, j);
//                    }
//                    // If even should come before odd
//                    else if (i % 2 == 0 && arr[i] % 2 != 0 && arr[j] % 2 == 0) {
//                        swap(arr, i, j);
//                    }
//                    // If odd should come before even
//                    else if (i % 2 != 0 && arr[i] % 2 == 0 && arr[j] % 2 != 0) {
//                        swap(arr, i, j);
//                    }
//                }
//            }
//        }
//
//        private static void swap(int[] arr, int i, int j) {
//            int t = arr[i];
//            arr[i] = arr[j];
//            arr[j] = t;
//        }
//    }


package Arrays.Arrays_Sorting;

import java.util.Arrays;

public class /*AlternatingEvenOddOpposite*/Problem3 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        alternateEvenOddOpposite(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void alternateEvenOddOpposite(int[] arr) {
        int n = arr.length;

        // Nested loops: sort evens ascending, odds descending, and place alternately
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
                // If even should come before odd in alternate positions
                else if (i % 2 == 0 && arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    swap(arr, i, j);
                }
                // If odd should come before even in alternate positions
                else if (i % 2 != 0 && arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

