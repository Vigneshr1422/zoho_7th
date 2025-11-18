package GitHubQuestions;

public class version {
    public static void main(String[] args) {
        String a = "1.2";
        String b = "1.0.1";

        int aLen = a.length();
        int bLen = b.length();

        int i = 0;
        int j = 0;
        while (i < aLen || j < bLen) {
            int n1 = 0;
            int n2 = 0;

            while (i < aLen && a.charAt(i) != '.') {
                n1 = n1 * 10 + (a.charAt(i) - '0');
                i++;
            }

            while (j < bLen && b.charAt(j) != '.') {
                n2 = n2 * 10 + (b.charAt(j) - '0');
                j++;
            }

            if (n1 > n2) {
                System.out.println("first is big");
                return;
            } else if (n1 < n2) {
                System.out.println("second is big");
                return;
            }

            i++; // skip '.'
            j++; // skip '.'
        }   

        // If no differences found
        System.out.println("Both are Equal");
    }
}
