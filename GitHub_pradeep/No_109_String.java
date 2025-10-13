package GitHub_pradeep;

public class No_109_String {
    public static void main(String[] args) {

                String str = "Today   is  wednesda";
                // Split words first
                String[] words = str.trim().split("\\s+");
                int gaps = words.length - 1;

                if (gaps == 0) {  // single word
                    System.out.println(words[0]);
                    return;
                }

                // Count letters dynamically
                int totalLetters = 0;
                for (String w : words) totalLetters += w.length();

                int totalSpaces = str.length() - totalLetters;
                int minStars = totalSpaces / gaps;
                int extraStars = totalSpaces % gaps;

                // Build result in one pass
                StringBuilder result = new StringBuilder(words[0]);
                for (int i = 1; i < words.length; i++) {
                    result.append("*".repeat(minStars));
                    if (extraStars > 0) {
                        result.append("*");
                        extraStars--;
                    }
                    result.append(words[i]);
                }

                System.out.println(result);
            }
        }

