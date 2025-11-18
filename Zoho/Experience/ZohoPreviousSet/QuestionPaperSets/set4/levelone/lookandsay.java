package set4.levelone;

public class lookandsay {
    public static void main(String[] args) {
        int n = 5;   // number of lines to print

        String s = "1";
        System.out.println(s);

        for (int i = 1; i < n; i++) {
            String next = "";
            int c = 1;

            for (int j = 1; j <= s.length(); j++) { 
                if (j < s.length() && s.charAt(j) == s.charAt(j - 1)) {
                    c++;
                } else {
                    next = next + c + s.charAt(j - 1);
                    c = 1; // reset count after appending
                }
            }

            s = next;
            System.out.println(s);
        }
    }
}
  