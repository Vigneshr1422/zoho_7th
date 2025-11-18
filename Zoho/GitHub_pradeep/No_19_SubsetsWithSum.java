package Zoho.GitHub_pradeep;

public class No_19_SubsetsWithSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 10};
        int sum = 10;
        findSubsets(arr, sum, 0, "");
    }

    // Recursive function to find subsets
    private static void findSubsets(int[] arr, int sum, int index, String subset) {
        if (sum == 0) {
            System.out.println("{" + subset.trim() + "}");
            return;
        }
        if (sum < 0 || index == arr.length) return;

        // Include current element
        findSubsets(arr, sum - arr[index], index + 1, subset + " " + arr[index]);
        // Exclude current element
        findSubsets(arr, sum, index + 1, subset);
    }
}
