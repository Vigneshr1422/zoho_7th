package Zoho.GitHub_pradeep;
import java.util.Scanner;

public class No_30_pangram {

    public class PangramCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();

            boolean[] present = new boolean[26]; // a-z
            int count = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                if (c >= 'A' && c <= 'Z') c = (char) (c + 'a' - 'A'); // convert to lowercase
                if (c >= 'a' && c <= 'z') {
                    if (!present[c - 'a']) {
                        present[c - 'a'] = true;
                        count++;
                    }
                }
            }

            System.out.println(count == 26); // true if all letters present
        }
    }
}
