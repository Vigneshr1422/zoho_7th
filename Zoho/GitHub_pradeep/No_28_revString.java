package Zoho.GitHub_pradeep;
import java.util.Scanner;

public class No_28_revString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            int i = 0, j = ch.length - 1;

            while (i < j) {
                if (!Character.isLetterOrDigit(ch[i])) i++;
                else if (!Character.isLetterOrDigit(ch[j])) j--;
                else {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
                }
            }

            System.out.println(new String(ch));
        }
    }
