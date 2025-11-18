package Zoho.GitHub_pradeep;

public class No_92_LineFormation {
        public static void main(String[] args) {
            int maxChars = 10;
            char fav = 'o';

            String[] words = {"Zoho", "Eating", "Watching", "Pogo", "Loving", "Mango"};

            StringBuilder line = new StringBuilder();
            int count = 0;

            for (int i = 0; i < words.length; i++) {
                int len = getValidLength(words[i], fav);

                // if adding current word exceeds limit -> print and reset
                if (count + len > maxChars) {
                    System.out.println(line.toString().trim());
                    line.setLength(0);
                    count = 0;
                }

                line.append(words[i]).append(" ");
                count += len;
            }

            // print remaining words if any
            if (line.length() > 0) {
                System.out.println(line.toString().trim());
            }
        }

        // helper function: counts chars excluding favorite char
        public static int getValidLength(String word, char fav) {
            int len = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(fav))
                    len++;
            }
            return len;
        }
    }


