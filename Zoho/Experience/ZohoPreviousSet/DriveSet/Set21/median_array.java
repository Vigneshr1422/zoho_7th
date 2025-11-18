package Zoho.Experience.ZohoPreviousSet.DriveSet.Set21;

public class median_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        System.out.println(medianFunction(arr1, arr2));

    }

    public static double medianFunction(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int total = n + m;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[total];
        while (i < n && j < m) {
            ans[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
        }

        while (i < n) {
            ans[k++] = arr1[i++];
        }
        while (j < m) {
            ans[k++] = arr2[j++];
        }

        if (total % 2 == 1)
        {
            return ans[total / 2];
        }
        else
        {
            return (ans[total / 2 - 1] + ans[total / 2]) / 2.0;
        }
    }
}
