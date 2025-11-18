package Zoho.GitHub_pradeep;
import java.util.*;
public class No_06_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                // first time, add directly
                result += ch;
            } else {
                // duplicate found, find next available
                char next = ch;

                if (Character.isLowerCase(ch)) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (result.indexOf(c) == -1) {
                            next = c;
                            break;
                        }
                    }
                } else if (Character.isUpperCase(ch)) {
                    for (char c = 'A'; c <= 'Z'; c++) {
                        if (result.indexOf(c) == -1) {
                            next = c;
                            break;
                        }
                    }
                } else if (Character.isDigit(ch)) {
                    for (char c = '0'; c <= '9'; c++) {
                        if (result.indexOf(c) == -1) {
                            next = c;
                            break;
                        }
                    }
                }

                result += next;
            }
        }

        return result;
    }
}
