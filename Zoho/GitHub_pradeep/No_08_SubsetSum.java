package Zoho.GitHub_pradeep;

import java.util.*;

public class No_08_SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum N: ");
        int target = sc.nextInt();

        System.out.println("Subsets with sum " + target + ":");
        findSubsets(arr, 0, new ArrayList<>(), 0, target);
    }

    // Backtracking function to find all subsets
    static void findSubsets(int[] arr, int index, ArrayList<Integer> current, int sum, int target) {
        if(sum == target) {
            System.out.println(current);
            return;
        }

        if(sum > target || index == arr.length) {
            return;
        }

        // Include current element
        current.add(arr[index]);
        findSubsets(arr, index + 1, current, sum + arr[index], target);

        // Exclude current element (backtrack)
        current.remove(current.size() - 1);
        findSubsets(arr, index + 1, current, sum, target);
    }
}
