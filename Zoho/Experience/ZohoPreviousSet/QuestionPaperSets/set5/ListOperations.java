package set5;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 4, 5, 6, 8, 9);
        List<Integer> list2 = Arrays.asList(1, 5, 8, 9, 2);

        // Union
        Set<Integer> union = new LinkedHashSet<>(list1);
        union.addAll(list2);

        // Intersection
        Set<Integer> intersection = new LinkedHashSet<>(list1);
        intersection.retainAll(list2);

        // Except: list1 without even + list2 without odd
        List<Integer> except = new ArrayList<>();
        for (int x : list1) {
            if (x % 2 != 0) except.add(x); // keep odd only
        }
        for (int x : list2) {
            if (x % 2 == 0) except.add(x); // keep even only
        }

        // Output
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Except: " + except);
    }
}

