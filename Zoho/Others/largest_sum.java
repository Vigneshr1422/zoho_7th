package Zoho.Others;
//day 2
// sliding window
public class largest_sum {
    public static void main(String[] args) {
        int[] arr = /*{0, 5, 6, 0, 9, 0, 1}*/ {0,0,7,9,3,0};

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > ans) {
                ans = sum;
            }
        }
        System.out.println(ans);

    }
}
