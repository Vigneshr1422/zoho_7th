package GitHub_pradeep;


public class No_09_first_occurence {

    // Custom indexOf function
    public static int customIndexOf(String a, String b) {
        int n = a.length();
        int m = b.length();

        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    break;
                }
            }
            if (j == m) { // all characters matched
                return i;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        String a = "test123String";
        String b = "123";

        // Using built-in indexOf
        int ans = a.indexOf(b);
        System.out.println("Using built-in indexOf: " + ans);

        // Using custom function
        int customAns = customIndexOf(a, b);
        System.out.println("Using customIndexOf: " + customAns);
    }
}

/*
 package set3;

public class FirstOccurrenceReverse {

    // Custom indexOf function
    public static int customIndexOf(String a, String b) {
        int n = a.length();
        int m = b.length();

        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    break;
                }
            }
            if (j == m) { // all characters matched
                return i;
            }
        }
        return -1; // not found
    }

    // Function to reverse words from match
    public static String reverseFromMatch(String s1, String s2) {
        int pos = customIndexOf(s1, s2);
        if (pos == -1) return s1; // if not found, return original

        // Step 1: find which word contains s2
        int n = s1.length();
        int wordStart = 0;
        int matchWordIndex = -1;
        int wordCount = 0;

        for (int i = 0; i <= n; i++) {
            if (i == n || s1.charAt(i) == ' ') {
                // current word = s1[wordStart .. i-1]
                if (pos >= wordStart && pos < i) {
                    matchWordIndex = wordCount;
                    break;
                }
                wordCount++;
                wordStart = i + 1;
            }
        }

        // Step 2: collect words manually (preserve spaces separately)
        String[] words = new String[100]; // safe size
        int w = 0;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            if (c == ' ') {
                words[w++] = temp.toString();
                temp.setLength(0);
                words[w++] = " "; // store space as separate entry
            } else {
                temp.append(c);
            }
        }
        if (temp.length() > 0) {
            words[w++] = temp.toString();
        }

        // Step 3: reverse words only from matched word onwards
        // But skip spaces while reversing
        int start = -1;
        int countWord = 0;
        for (int i = 0; i < w; i++) {
            if (!words[i].equals(" ")) {
                if (countWord == matchWordIndex) {
                    start = i;
                    break;
                }
                countWord++;
            }
        }

        // Collect indices of words (not spaces) from start..end
        int[] wordIndices = new int[100];
        int size = 0;
        for (int i = start; i < w; i++) {
            if (!words[i].equals(" ")) {
                wordIndices[size++] = i;
            }
        }

        // Reverse those word positions
        for (int i = 0; i < size / 2; i++) {
            String tmp = words[wordIndices[i]];
            words[wordIndices[i]] = words[wordIndices[size - 1 - i]];
            words[wordIndices[size - 1 - i]] = tmp;
        }

        // Step 4: rebuild string
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < w; i++) {
            ans.append(words[i]);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s1 = "This is a test input string";
        String s2 = "st";

        String result = reverseFromMatch(s1, s2);
        System.out.println("Input : " + s1);
        System.out.println("Pattern : " + s2);
        System.out.println("Output : " + result);
    }
}



 package set3;

public class ReverseWordsFromSubstring {

    // Custom method to find the first occurrence of substring s2 in s1
    public static int customIndexOf(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    // Method to reverse words in s1 starting from the word containing s2
    public static String reverseWordsFromSubstring(String s1, String s2) {
        int pos = customIndexOf(s1, s2);
        if (pos == -1) return s1; // If s2 is not found, return s1 as is

        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        boolean inWord = false;
        int wordCount = 0;
        int targetWordIndex = -1;

        // Traverse s1 to extract words and identify the target word
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == ' ' || i == s1.length() - 1) {
                if (inWord) {
                    if (wordCount == targetWordIndex) {
                        result.append(currentWord.reverse());
                    } else {
                        result.append(currentWord);
                    }
                    result.append(c);
                    currentWord.setLength(0);
                    inWord = false;
                    wordCount++;
                }
            } else {
                currentWord.append(c);
                inWord = true;
                if (wordCount == targetWordIndex) {
                    targetWordIndex = wordCount;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "This is a test input string";
        String s2 = "st";
        String result = reverseWordsFromSubstring(s1, s2);
        System.out.println("Input: " + s1);
        System.out.println("Output: " + result);
    }
}
*/