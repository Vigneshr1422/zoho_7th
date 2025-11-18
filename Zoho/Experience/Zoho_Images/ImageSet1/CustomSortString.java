package Zoho.Experience.Zoho_Images.ImageSet1;
/*
Custom Sort String — Problem Statement

Problem:
Given two strings pattern and str, reorder the characters of str so that:

Characters that appear in pattern appear first and follow the order given by pattern.
— If a character c appears k times in str and c appears in pattern, then c should appear k times consecutively in the result at the position determined by pattern.

Characters in str that do not appear in pattern should appear at the end of the result in their original relative order of appearance in str.

Return the resulting reordered string.

Input (from stdin)

Two whitespace-separated tokens:

pattern str


pattern — a string containing distinct characters that define the desired order for characters appearing in str.

str — the string to be reordered.

You may assume ASCII characters (0–255). pattern may be shorter than, equal to, or longer than the distinct set in str.

Output

A single string: the characters of str reordered according to the rules above.

Example 1

Input

cba abcdabc


Output

ccbbaad


Explanation

Frequencies in str: a:2, b:2, c:2, d:1

Follow pattern = "cba" → append c twice, b twice, a twice → "ccbbaa"

Remaining char d (not in pattern) appended in original order → "ccbbaad"

Example 2

Input

xyz abracadabra


Output

aaabrbrcd


Explanation

pattern = "xyz" has x,y,z but str has none of them. So no chars appended from pattern.

All characters from str (in their original relative order) appear at the end: "abracadabra" → but since none are in pattern, the output is exactly the original string.
(If you want pattern characters only, give a pattern with characters that exist in str.)
 */
import java.util.*;

public class CustomSortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = sc.next();
        String str = sc.next();

        // count frequency of str characters
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        StringBuilder result = new StringBuilder();

        // follow pattern order
        for (char ch : pattern.toCharArray()) {
            while (freq[ch] > 0) {
                result.append(ch);
                freq[ch]--;
            }
        }

        // if str has chars not in pattern, add them at end
        for (char ch : str.toCharArray()) {
            while (freq[ch] > 0) {
                result.append(ch);
                freq[ch]--;
            }
        }

        System.out.println(result.toString());
    }
}
/*'
pattern: "cba"
str:     "abcdabc"
Step-by-step Execution
Count frequency of each character in str

yaml
Copy code
a: 2, b: 2, c: 2, d:1
Append characters following pattern "cba":

'c' → append 2 times → "cc"

'b' → append 2 times → "ccbb"

'a' → append 2 times → "ccbbaa"

Add remaining characters not in pattern:

'd' → append 1 time → "ccbbaad"

Output

ccbbaad

*/