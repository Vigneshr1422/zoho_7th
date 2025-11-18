package Zoho.GitHub_pradeep;

public class No_45_KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Subarray Sum = " + maxSubArraySum(arr));
    }

    static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];   // best sum found
        int currentSum = arr[0]; // current window sum

        for (int i = 1; i < arr.length; i++) {
            // Either extend the current subarray or start new from current element
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Track global maximum
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}
