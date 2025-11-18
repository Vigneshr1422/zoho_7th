package GitHubQuestions;
public class a6_a33_FirstOccurrenceZoho {
    /*/
    🔹 Program summary

a = "zohocorporation"

b = "port"

For every character in b, program finds the first occurrence index in a.

'p' → index 5

'o' → index 1

'r' → index 7

't' → index 12

So among these,

min index = 1

max index = 12

Then it extracts substring of a from index 1 → 12.

That is "ohocorporat" */
    public static void main(String[] args) {
        String a = "zohocorporation";
        String b = "port";

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // For each char in b, find first occurrence in a (manual Problem_Solving.search)
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == c) {
                    if (j < min) min = j;
                    if (j > max) max = j;
                    break; // first occurrence only
                }
            }
        }

        String ans = SubString(a, min, max);
        System.out.println(ans);
    }

    public static String SubString(String str, int s, int e) {
        StringBuilder ans = new StringBuilder();
        for (int i = s; i <= e; i++) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
