package Zoho.GitHub_pradeep;

public class No_52_smallestPali {
    public static void main(String[] args) {
            int num = 23545;
            System.out.println("Next palindrome: " + nextPalindrome(num));
        }

        public static int nextPalindrome(int num) {
            char[] digits = String.valueOf(num).toCharArray();
            int n = digits.length;

            while (true) {
                num++;
                if (isPalindrome(num)) return num;
            }
        }

        public static boolean isPalindrome(int n) {
            String s = String.valueOf(n);
            int i = 0, j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
        }
}
