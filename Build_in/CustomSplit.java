package Build_in;

import java.util.ArrayList;
import java.util.List;

public class CustomSplit {
    public static String[] mySplit(String str, char delimiter) {
        List<String> parts = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == delimiter) {
                parts.add(current.toString());
                current.setLength(0); // reset
            } else {
                current.append(ch);
            }
        }
        // last part
        parts.add(current.toString());

        return parts.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String s = "apple,mango,banana,grapes";
        String[] result = mySplit(s, ',');
        for (String word : result) {
            System.out.println(word);
        }
    }
}

