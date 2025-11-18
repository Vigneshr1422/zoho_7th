package Zoho.Experience.GFG_Experinece;

public class LongestRepeatingCharReplacement {

    // Function to find longest substring after at most k replacements
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];  // Frequency array for characters
        int maxCount = 0;           // Max frequency in current window
        int left = 0;               // Left pointer of window
        int result = 0;             // Result: max length

        for (int right = 0; right < s.length(); right++) {
            // Include current character in window
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // If replacements needed > k, shrink window from left
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update result
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    // Testing
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));     // Output: 4
        System.out.println(characterReplacement("AABABBA", 1));  // Output: 4
        System.out.println(characterReplacement("AAAA", 0));     // Output: 4
        System.out.println(characterReplacement("ABCDE", 1));    // Output: 2
    }
}
