package Zoho.Experience.Zoho_Images.ImageSet1;

import java.util.*;

public class MaxOrders {
    public static int maxOrders(int[] ingredients, int[] orders) {
        int n = ingredients.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // check if this order can be fulfilled
            if (ingredients[i] >= orders[i]) {
                count++;
                ingredients[i] -= orders[i]; // reduce available
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] ingredients = {3, 1, 2};
        int[] orders = {2, 1, 2};

        System.out.println(maxOrders(ingredients, orders)); // Output: 3
    }
}
