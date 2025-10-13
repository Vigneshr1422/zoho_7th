package Pdf110;

public class No_84_MaxPositiveSubarray {
    public static void main(String[] args) {
    int[] arr = {2, 7, 5, 1, 3, 2, 9, 7};

    int n = arr.length;
    int maxSum = 0;
    int currSum = 0;
    int start = 0, end = 0, tempStart = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] >= 0) {
            currSum += arr[i];
        } else {
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i - 1;
            }
            currSum = 0;
            tempStart = i + 1;
        }
    }

    // Check at the end (last segment might be max)
    if (currSum > maxSum) {
        maxSum = currSum;
        start = tempStart;
        end = n - 1;
    }

    System.out.println("Sum : " + maxSum);
    System.out.print("Elements : ");
    for (int i = start; i <= end; i++) {
        System.out.print(arr[i]);
        if (i < end) System.out.print(", ");
    }
    System.out.println();
}
}/*
        🔹 Output
        yaml
Copy code
Sum : 14
Elements : 3, 2, 9
*/