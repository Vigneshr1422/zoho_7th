package GitHubQuestions;

import java.util.Scanner;

public class No_14_AlternateSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Manual sort in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int left = 0;
        int right = n - 1;
        System.out.print("{");
        while (left <= right) {
            if (left != right) {
                System.out.print(arr[right] + ", ");
                System.out.print(arr[left] + ", ");
            } else {
                System.out.print(arr[left]);
            }
            left++;
            right--;
        }
        System.out.println("}");
    }
}
