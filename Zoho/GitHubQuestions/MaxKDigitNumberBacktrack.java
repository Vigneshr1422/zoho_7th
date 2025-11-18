package GitHubQuestions;
import java.util.Scanner;
/*
 88. Given an array of numbers and a number k. Print the maximum possible k digit number which can be formed using given numbers.
  INPUT  :  
  
  Enter the array size  :  4
  Enter the elements  :  1 4 973 97
  Enter number of digits  :  3
  
  OUTPUT  :

  974 

  INPUT  :  
  
  Enter the array size  :  6
  Enter the elements  :  1 4 89 73 9 7
  Enter number of digits  :  5
  
  OUTPUT  :

  98973
 */
public class MaxKDigitNumberBacktrack {
    static String maxNumber = null; // store the best result

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.print("Enter number of digits k: ");
        int k = sc.nextInt();

        boolean[] used = new boolean[n];
        backtrack(arr, used, "", 0, k);

        if (maxNumber == null) {
            System.out.println("Not possible");
        } else {
            System.out.println("Largest " + k + " digit number: " + maxNumber);
        }
    }

    // Backtracking function
    private static void backtrack(String[] arr, boolean[] used, String current, int currentLen, int k) {
        if (currentLen == k) {
            if (maxNumber == null || current.compareTo(maxNumber) > 0) {
                maxNumber = current;
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                int len = arr[i].length();
                if (currentLen + len <= k) { // only take if it fits
                    used[i] = true;
                    backtrack(arr, used, current + arr[i], currentLen + len, k);
                    used[i] = false;
                }
            }
        }
    }
}
