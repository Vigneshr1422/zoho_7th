package GitHub_pradeep;

public class No_47_WordBreak {
    static String[] dict = {
            "i", "like", "sam", "sung", "samsung",
            "mobile", "ice", "cream", "icecream",
            "man", "go", "mango"
    };

    public static void main(String[] args) {
        String s1 = "ilike";
        String s2 = "ilikesamsung";

        System.out.println(s1 + " → " + (canSegment(s1) ? "Yes" : "No"));
        System.out.println(s2 + " → " + (canSegment(s2) ? "Yes" : "No"));
    }

    // Function to check if string can be segmented
    public static boolean canSegment(String str) {
        int n = str.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // empty string is always valid

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && isInDict(str.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    // Check manually if substring exists in dictionary
    private static boolean isInDict(String word) {
        for (String d : dict) {
            if (d.equals(word)) return true;
        }
        return false;
    }
}
