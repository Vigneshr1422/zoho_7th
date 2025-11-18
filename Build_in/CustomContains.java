package Build_in;

public class CustomContains {
    public static boolean myContains(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (m == 0) return true; // empty pattern always matches
        if (m > n) return false;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) return true; // full match found
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(myContains("helloworld", "world")); // true
        System.out.println(myContains("helloworld", "word"));  // false
    }
}

