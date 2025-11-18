package GitHubQuestions;
import java.util.*;

public class StringFav {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ethana character venu: ");
        int maxChar = in.nextInt();

        System.out.print("Fav char: ");
        char fav = in.next().charAt(0);
        in.nextLine(); // flush newline

        System.out.print("Enter words (comma separated): ");
        String sentence = in.nextLine();

        String[] words = sentence.split(",\\s*");
        int n = words.length;

        // bubble sort based on count
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lengtCount(words[j], fav) > lengtCount(words[j + 1], fav)) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        int i = 0, j = n - 1;
        while (i < j) {
            if (lengtCount(words[i], fav) + lengtCount(words[j], fav) <= maxChar) {
                System.out.println(words[i] + " " + words[j]);
                i++;
                j--;
            } else {
                j--;
            }
        }
    }

    public static int lengtCount(String str, char f) {
        int c = 0;
        for (char t : str.toCharArray()) {
            if (Character.toLowerCase(t) != Character.toLowerCase(f)) {
                c++;
            }
        }
        return c;
    }
}
