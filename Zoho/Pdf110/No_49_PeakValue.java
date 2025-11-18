package Zoho.Pdf110;

import java.util.Arrays;

public class No_49_PeakValue {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 6, 8, 1};
        peakSort(arr);
    }

    public static void peakSort(int[] arr) {
        int n = arr.length;

        // Single pass insertion between peaks
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) { // Peak detected
                // Bubble down the peak to correct position in the segment
                int j = i;
                while (j > 0 && arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
            }
        }
    }
}
