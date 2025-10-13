package Pdf110;
import java.util.*;

public class No_58_union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array  :  ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements    :  ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array  :  ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements    :  ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] union = new int[n1 + n2];
        int k = 0;

        // Step 1: Add all elements from arr1
        for (int i = 0; i < n1; i++) {
            if (!exists(union, k, arr1[i])) {
                union[k++] = arr1[i];
            }
        }

        // Step 2: Add elements from arr2 if not already present
        for (int i = 0; i < n2; i++) {
            if (!exists(union, k, arr2[i])) {
                union[k++] = arr2[i];
            }
        }

        System.out.println("\nOUTPUT  : ");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }

    // Helper method: checks if element already present
    public static boolean exists(int[] arr, int size, int val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) return true;
        }
        return false;
    }
}

/*
package Pdf110;
import java.util.*;

public class No_58_union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array  :  ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements    :  ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array  :  ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements    :  ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Use LinkedHashSet to maintain insertion order + remove duplicates
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        System.out.println("\nOUTPUT  : ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}

 */
