package GitHub_pradeep;
import java.util.*;
public class No_101_relation {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("No of members: ");
            int n = in.nextInt();
            in.nextLine();

            String[][] arr = new String[n][2];
            for (int i = 0; i < n; i++) {
                String[] str = in.nextLine().split(" ");
                arr[i][0] = str[0]; // child
                arr[i][1] = str[1]; // father
            }

            String target = in.nextLine();
            String[] s = target.split(" ");
            String tar = s[0];
            int level = (s.length == 2) ? Integer.parseInt(s[1]) : 2;

            // Map father -> list of children
            Map<String, List<String>> map = new HashMap<>();

            for (String[] k : arr) {
                String child = k[0];
                String father = k[1];

                map.putIfAbsent(father, new ArrayList<>());
                map.get(father).add(child);
            }

            // BFS traversal to find level children
            Queue<String> qu = new LinkedList<>();
            qu.add(tar);
            int cl = 0;

            while (!qu.isEmpty() && cl < level) {
                int size = qu.size();
                for (int i = 0; i < size; i++) {
                    String parent = qu.poll();
                    List<String> childList = map.get(parent);
                    if (childList != null) {
                        qu.addAll(childList);
                    }
                }
                cl++;
            }

            System.out.println("Children at level " + level + ": " + qu);
            System.out.println("Count: " + qu.size());
        }
    }