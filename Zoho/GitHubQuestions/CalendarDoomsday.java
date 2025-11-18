package GitHubQuestions;
import java.util.*;

public class CalendarDoomsday {
    static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter date in dd/mm/yyyy format:");
        String dates = in.nextLine();

        String[] part = dates.split("/");
        int date = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[2]);

        String weekday = getDay(date, month, year);
        System.out.println("Weekday: " + weekday);
    }

    public static String getDay(int day, int month, int year) {
        int century = year / 100;
        int y = year % 100;

        int centuryDoms = getCentury(century);
        int yearOffset = (y + y / 4) % 7;

        boolean leap = isLeapYear(year);
        int monthDooms = getMonthDoomsday(month, leap);

        int doomsday = (centuryDoms + yearOffset) % 7;

        int diff = day - monthDooms;
        int weekday = (doomsday + diff % 7 + 7) % 7;

        return days[weekday];
    }

    public static int getMonthDoomsday(int month, boolean leap) {
        switch(month) {
            case 1: return leap ? 4 : 3;
            case 2: return leap ? 29 : 28;
            case 3: return 14;
            case 4: return 4;
            case 5: return 9;
            case 6: return 6;
            case 7: return 11;
            case 8: return 8;
            case 9: return 5;
            case 10: return 10;
            case 11: return 7;
            case 12: return 12;
        }
        return 0;
    }

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getCentury(int c) {
        int rem = c % 4;
        switch(rem) {
            case 0: return 2; // Tuesday
            case 1: return 0; // Sunday
            case 2: return 5; // Friday
            case 3: return 3; // Wednesday
        }
        return 0;
    }
}
