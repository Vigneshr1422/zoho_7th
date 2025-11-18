package Zoho.Others;

import java.util.*;

public class relation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[][] arr = new String[n][2];

        // read child-father pairs
        for (int i = 0; i < n; i++) {
            String[] part = in.nextLine().split(" ");
            arr[i][0] = part[0]; // child
            arr[i][1] = part[1]; // father
        }

        // debug: print pairs
        for (String[] strings : arr) {
            System.out.println(strings[0] + " " + strings[1]);
        }

        // read target (with optional level)
        System.out.println("Target : ");
        String[] t = in.nextLine().split(" ");
        String tar = t[0];
        int level;
        if (t.length == 2) {
            level = Integer.parseInt(t[1]);
        } else {
            level = 2; // default grandchildren
        }

        // build father->children map
        Map<String, List<String>> relation = new HashMap<>();
        for (String[] element : arr) {
            String child = element[0];
            String father = element[1];
            relation.computeIfAbsent(father, k -> new ArrayList<>()).add(child);
        }

        // BFS traversal till given level
        Queue<String> q = new LinkedList<>();
        q.add(tar);
        int cl = 0;

        while (!q.isEmpty() && cl < level) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String parent = q.poll();
                List<String> child = relation.get(parent);
                if (child != null) {
                    q.addAll(child);
                }
            }
            cl++;
        }

        // q now contains all names at the required level
        System.out.println("Children at level " + level + " of " + tar + " : " + q);
        System.out.println("The count is " + q.size());
    }
}
