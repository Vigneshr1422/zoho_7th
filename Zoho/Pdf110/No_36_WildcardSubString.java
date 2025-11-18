package Zoho.Pdf110;

public class No_36_WildcardSubString {
    public static void main(String[] args) {
        String text = "Spoon";
        String pattern = "Sp*n";

        // make case-insensitive
        text = text.toLowerCase();
        pattern = pattern.toLowerCase();

        boolean found = false;
        for(int i = 0; i < text.length(); i++){
            String sub = text.substring(i);
            if(isWildCard(sub, pattern)){
                found = true;
                break;
            }
        }

        System.out.println(found); // prints true or false
    }

    // DP-based wildcard matching
    public static boolean isWildCard(String text, String pattern){
        int n = text.length();
        int m = pattern.length();

        boolean[][] dp = new boolean[n+1][m+1];

        dp[0][0] = true; // empty text matches empty pattern

        // initialize first row for patterns starting with *
        for(int j = 1; j <= m; j++){
            if(pattern.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                char textCh = text.charAt(i-1);
                char patternCh = pattern.charAt(j-1);

                if(patternCh == '?' || patternCh == textCh){
                    dp[i][j] = dp[i-1][j-1];
                } else if(patternCh == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
            }
        }

        return dp[n][m];
    }
}
