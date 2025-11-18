package Zoho.Experience.Zoho_Images.ImageSet1;
import java.util.*;
public class ArraySortInPlace {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        function(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void function(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] > arr[j]) {
                    swap(arr, i, j);
                } else if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] < arr[j]) {
                    swap(arr, i, j);
                } else if (i % 2 == 0 && arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    swap(arr, i, j);
                } else if (i % 2 != 0 && arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                    swap(arr, i, j);
                }

            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
/*
public static void function(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {

            // One combined condition
            boolean wrongPosition =
                    // Position parity mismatch
                    (i % 2 == 0 && arr[i] % 2 != 0) ||
                    (i % 2 != 0 && arr[i] % 2 == 0) ||

                    // Even index: even numbers ascending
                    (i % 2 == 0 && arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] > arr[j]) ||

                    // Odd index: odd numbers descending
                    (i % 2 != 0 && arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] < arr[j]);

            if (wrongPosition) {
                swap(arr, i, j);
            }
        }
    }
}

public static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}

 */