package GitHub_pradeep;

import java.util.Arrays;

public class No_25_AlternateMaxMinInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rearrange(arr);
        for (int num : arr) System.out.print(num + " ");
    }

    private static void rearrange(int[] arr) {
        Arrays.sort(arr); // Sort the array first
        int n = arr.length;

        for (int i = 1; i < n - 1; i += 2) {
            // Swap element at i with element at the end minus the number of swaps done
            int temp = arr[i];
            arr[i] = arr[n - ((i + 1) / 2)];
            arr[n - ((i + 1) / 2)] = temp;
        }
    }
}
