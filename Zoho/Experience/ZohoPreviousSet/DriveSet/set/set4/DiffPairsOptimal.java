package folders.set.set4;

import java.util.*;

public class DiffPairsOptimal {
    public static void main(String[] args) {
        int[] arr = {4,6,8,1,3,7,9};
        int diff = 2;
        Set<Integer> set = new HashSet<>();
        int count = 0;

        // store numbers
        for (int num : arr) set.add(num);

        for (int num : arr) {
            if (set.contains(num + diff)) count++;
        }

        System.out.println("Number of Pairs: " + count);
    }
}
