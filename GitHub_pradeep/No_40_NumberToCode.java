package GitHub_pradeep;

import java.util.Scanner;

public class No_40_NumberToCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        String numStr = sc.nextLine();

        System.out.println("Possible codes:");
        printCodes(numStr, "");
    }

    static void printCodes(String numStr, String current) {
        if (numStr.length() == 0) {
            System.out.println(current);
            return;
        }

        // Take 1 digit
        int oneDigit = numStr.charAt(0) - '0';
        if (oneDigit >= 1 && oneDigit <= 9) {
            printCodes(numStr.substring(1), current + (char) ('a' + oneDigit - 1));
        }

        // Take 2 digits if possible
        if (numStr.length() >= 2) {
            int twoDigit = Integer.parseInt(numStr.substring(0, 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                printCodes(numStr.substring(2), current + (char) ('a' + twoDigit - 1));
            }
        }
    }
}
