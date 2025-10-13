package GitHub_pradeep;

public class No_49_RemoveChars {
    public static void main(String[] args) {
        String s1 = "expErIence";
        String s2 = "En";

        String result = removeChars(s1, s2);
        System.out.println(result);
    }

    public static String removeChars(String s1, String s2) {
        boolean[] present = new boolean[256]; // ASCII lookup

        // mark characters from s2
        for (int i = 0; i < s2.length(); i++) {
            present[s2.charAt(i)] = true;
        }

        // build result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (!present[s1.charAt(i)]) {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }
}
