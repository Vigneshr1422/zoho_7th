package set10;

import java.util.ArrayList;

public class mergeWithoutduplicate {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 6, 9};
        int[] arr2 = {2, 4, 5, 10};

        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (mergedList.isEmpty() || mergedList.get(mergedList.size() - 1) != arr1[i])
                    mergedList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (mergedList.isEmpty() || mergedList.get(mergedList.size() - 1) != arr2[j])
                    mergedList.add(arr2[j]);
                j++;
            } else {
                // equal elements
                if (mergedList.isEmpty() || mergedList.get(mergedList.size() - 1) != arr1[i])
                    mergedList.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < arr1.length) {
            if (mergedList.get(mergedList.size() - 1) != arr1[i])
                mergedList.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            if (mergedList.get(mergedList.size() - 1) != arr2[j])
                mergedList.add(arr2[j]);
            j++;
        }

        System.out.println(mergedList);
    }
}


