package Zoho.GitHub_pradeep;

public class No_13_X_pattern {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int n = word.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) System.out.print(word.charAt(i));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}
