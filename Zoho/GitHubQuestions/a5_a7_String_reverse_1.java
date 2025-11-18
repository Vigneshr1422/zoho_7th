package GitHubQuestions;

public class a5_a7_String_reverse_1 {
    public static void main(String[] args) {
        String s1 = "Hacker";
        String s2 = "Rank";

        // process both strings
        process(s1);
        process(s2);
    }

    static void process(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.append(s.charAt(i));
            } else {
                odd.append(s.charAt(i));
            }
        }
        System.out.println(even + " " + odd);
    }
}
