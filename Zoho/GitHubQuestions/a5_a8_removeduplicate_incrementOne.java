package GitHubQuestions;
import java.util.*;

public class a5_a8_removeduplicate_incrementOne {

    public static void main(String[] args) {
        String a[] = {"Java123", "python1223"};

        for (String x : a) {
            System.out.println(function(x));
        }
    }

    public static String function(String str) {

        Set<Character> set = new HashSet<>();
        StringBuilder an = new StringBuilder();

        for (char x : str.toCharArray()) {
            char original = x;

            // Corrected loop: keep incrementing if x is already seen
            while (set.contains(x)) {
                if (Character.isLowerCase(x)) {
                    x = (char) ((x - 'a' + 1) % 26 + 'a');
                } else if (Character.isUpperCase(x)) {
                    x = (char) ((x - 'A' + 1) % 26 + 'A');
                } else if (Character.isDigit(x)) {
                    x = (char) ((x - '0' + 1) % 10 + '0');
                }
                if (x == original) break; // fallback to avoid infinite loop
            }

            set.add(x);
            an.append(x);
        }

        return an.toString();
    }
}
