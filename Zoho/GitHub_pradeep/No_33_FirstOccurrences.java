package Zoho.GitHub_pradeep;
import java.util.Scanner;

public class No_33_FirstOccurrences {

    public class FirstOccurrences {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
            String s2 = sc.next();

            int minIndex = s1.length();
            int maxIndex = -1;

            for (int i = 0; i < s2.length(); i++) {
                char c = s2.charAt(i);
                int idx = s1.indexOf(c); // first occurrence in s1
                if (idx != -1) {
                    if (idx < minIndex) minIndex = idx;
                    if (idx > maxIndex) maxIndex = idx;
                }
            }

            if (minIndex <= maxIndex) {
                System.out.println(s1.substring(minIndex, maxIndex + 1));
            } else {
                System.out.println(""); // no match
            }
        }
    }
}
