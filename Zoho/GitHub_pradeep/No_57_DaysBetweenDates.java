package Zoho.GitHub_pradeep;

public class No_57_DaysBetweenDates {
          public static void main(String[] args) {
            int[] dt1 = {10, 2, 2014}; // dd, mm, yyyy
            int[] dt2 = {10, 3, 2015};

            System.out.println("Total Days = " + getDaysBetween(dt1, dt2));
        }

        // --- Function to count total days between two dates ---
        public static int getDaysBetween(int[] d1, int[] d2) {
            int n1 = countDays(d1[0], d1[1], d1[2]);
            int n2 = countDays(d2[0], d2[1], d2[2]);
            return Math.abs(n2 - n1);
        }

        // --- Convert a date to total days from 01/01/0000 ---
        public static int countDays(int day, int month, int year) {
            int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int days = year * 365 + day;

            // Add days for months in current year
            for (int i = 0; i < month - 1; i++) {
                days += monthDays[i];
            }

            // Add a day for each leap year before this date
            days += countLeapYears(day, month, year);

            return days;
        }

        // --- Leap year logic ---
        public static int countLeapYears(int day, int month, int year) {
            // If month <= Feb, don’t count current year's leap day
            if (month <= 2) {
                year--;
            }
            return year / 4 - year / 100 + year / 400;
        }
    }
