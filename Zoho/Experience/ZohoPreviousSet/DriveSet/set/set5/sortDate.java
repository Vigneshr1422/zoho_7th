package folders.set.set5;

import java.util.Scanner;

public class sortDate {

    // Month names
    static String[] months = {"January","February","March","April","May","June",
                              "July","August","September","October","November","December"};
    static String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

    // Days in each month (non-leap year by default)
    static int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ---- Input ----
        System.out.println("Enter Date (day number): ");
        int day = in.nextInt();
        in.nextLine();

        System.out.println("Enter Month (e.g. July): ");
        String monthStr = in.nextLine();

        System.out.println("Enter Year: ");
        int year = in.nextInt();

        System.out.println("Enter Time (hh:mm:ss): ");
        String timeStr = in.next();

        System.out.println("Enter Milliseconds (e.g. 000): ");
        int ms = in.nextInt();

        System.out.println("Enter Weekday (e.g. Wed): ");
        String weekdayStr = in.next();

        System.out.println("Enter milliseconds to add: ");
        long addMs = in.nextLong();

        // ---- Parse Input ----
        int month = getMonthIndex(monthStr);

        String[] timeParts = timeStr.split(":");
        int hh = Integer.parseInt(timeParts[0]);
        int mm = Integer.parseInt(timeParts[1]);
        int ss = Integer.parseInt(timeParts[2]);

        // ---- Add milliseconds ----
        long totalMs = ms + addMs;

        ss += totalMs / 1000;
        ms = (int)(totalMs % 1000);

        mm += ss / 60;
        ss = ss % 60;

        hh += mm / 60;
        mm = mm % 60;

        day += hh / 24;
        hh = hh % 24;

        // ---- Adjust day/month/year ----
        while (true) {
            int mdays = getMonthDays(month, year);
            if (day <= mdays) break;
            day -= mdays;
            month++;
            if (month == 12) {
                month = 0;
                year++;
            }
        }

        // ---- Adjust weekday ----
        int weekdayIndex = getWeekdayIndex(weekdayStr);
        long daysAdded = addMs / (24L * 60 * 60 * 1000);
        weekdayIndex = (int)((weekdayIndex + daysAdded) % 7);

        // ---- Output ----
        System.out.printf("%02d %s %d %02d:%02d:%02d %03d %s\n",
                day, months[month], year, hh, mm, ss, ms, days[weekdayIndex]);
    }

    // --- Helpers ---
    static int getMonthIndex(String m) {
        for (int i=0; i<12; i++) {
            if (months[i].equalsIgnoreCase(m)) return i;
        }
        return -1;
    }

    static int getMonthDays(int month, int year) {
        if (month == 1) { // February
            return isLeap(year) ? 29 : 28;
        }
        return monthDays[month];
    }

    static boolean isLeap(int y) {
        return (y%400==0) || (y%4==0 && y%100!=0);
    }

    static int getWeekdayIndex(String d) {
        for (int i=0; i<7; i++) {
            if (days[i].equalsIgnoreCase(d)) return i;
        }
        return -1;
    }
}
