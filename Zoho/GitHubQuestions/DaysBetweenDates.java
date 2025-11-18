package Zoho.GitHubQuestions;

import java.util.*;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first date (dd mm yyyy):");
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.println("Enter second date (dd mm yyyy):");
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();

        int days = Math.abs(toDays(d1, m1, y1) - toDays(d2, m2, y2));
        System.out.println("Difference in days = " + days);
    }

    // convert date → total number of days
    static int toDays(int d, int m, int y) {
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30}; 

        int days = d;

        // months-oda days add பண்ணுது
        for (int i = 1; i < m; i++) {
            days += month[i];
        }

        // leap year check (February மாதம் +1)
        if (m > 2 && isLeap(y)) {
            days++;
        }

        // வருடம் * 365 + leap years count
        days += y * 365 + countLeap(y);

        return days;
    }

    // leap year check
    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // அந்த வருடத்துக்கு முன்னாடி எத்தனை leap years வந்திருக்கு
    static int countLeap(int y) {
        y--;
        return y / 4 - y / 100 + y / 400;
    }
}
