package folders.set.set4;

import java.util.Arrays;

public class LowestProductThree {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -9, 5};
        int n = arr.length;

        Arrays.sort(arr); // [-9, -4, 1, 2, 5]

        // Option 1: first 3 numbers
        int prod1 = arr[0] * arr[1] * arr[2];

        // Option 2: two smallest (most negative) * largest
        int prod2 = arr[0] * arr[1] * arr[n - 1];

        int minProd = Math.min(prod1, prod2);

        System.out.print("Numbers producing min product: ");
        if (minProd == prod1) {
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        } else {
            System.out.println(arr[0] + " " + arr[1] + " " + arr[n - 1]);
        }

        System.out.println("Product: " + minProd);
    }
}

