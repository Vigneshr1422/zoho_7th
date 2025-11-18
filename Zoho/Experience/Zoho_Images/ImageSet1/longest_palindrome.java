package Zoho.Experience.Zoho_Images.ImageSet1;

public class longest_palindrome {
   public static void main(String[] args) {
    String a="babad";
    System.out.println(longestPalindrome(a));
   } 
   public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandFrom(s, i, i);     // odd
        int len2 = expandFrom(s, i, i + 1); // even
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private static int expandFrom(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }
    // after break, left, right are one step too far
    return right - left - 1;
}


}

