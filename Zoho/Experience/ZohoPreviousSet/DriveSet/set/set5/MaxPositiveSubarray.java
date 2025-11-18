package folders.set.set5;

public class MaxPositiveSubarray {
    public static void main(String[] args) {
        int[] arr1 = {-8, 11, 15, -10, 12, 17, 19, -1};
        int[] arr2 = {1, -8, 7, 8, 9, -10, 32, -11};

        solve(arr1);
        solve(arr2);
    }

    public static void solve(int[] arr) {
        int maxSum = 0, currentSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                currentSum += arr[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                }
            } else {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // print result
        System.out.print("Max Sum = " + maxSum + " Elements = {");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(",");
        }
        System.out.println("}");
    }
}
