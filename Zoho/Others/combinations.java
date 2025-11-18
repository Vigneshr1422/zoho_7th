package Zoho.Others;

import java.util.*;

public class combinations {
    public static void main(String[] args) {
        int[] arr = {3, 9, 7, 4, 6, 8};
        int tar = 3;

        List<List<Integer>> ans = new ArrayList<>();

        // 🔸 Step 1: Filter elements divisible by tar
        List<Integer> filtered = new ArrayList<>();
        for (int num : arr) {
            if (num % tar == 0) {
                filtered.add(num);
            }
        }

        // 🔸 Step 2: Two element combinations
        for (int i = 0; i < filtered.size(); i++) {
            for (int j = i + 1; j < filtered.size(); j++) {
                int sum = filtered.get(i) + filtered.get(j);
                if (sum % tar == 0) {
                    ans.add(Arrays.asList(filtered.get(i), filtered.get(j)));
                }
            }
        }

        // 🔸 Step 3: Three element combinations
        for (int i = 0; i < filtered.size(); i++) {
            for (int j = i + 1; j < filtered.size(); j++) {
                for (int k = j + 1; k < filtered.size(); k++) {
                    int sum = filtered.get(i) + filtered.get(j) + filtered.get(k);
                    if (sum % tar == 0) {
                        ans.add(Arrays.asList(filtered.get(i), filtered.get(j), filtered.get(k)));
                    }
                }
            }
        }

        // 🔸 Step 4: Print result
        for (List<Integer> store : ans) {
            System.out.println(store);
        }

        System.out.println("No of groups: " + ans.size());
    }
}
