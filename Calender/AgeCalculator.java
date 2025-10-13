//package Calender;
//
//public class AgeCalculator {
//}
//public class AgeCalculator {
//
//    public static void main(String[] args) {
//        int[] dob = {15, 8, 2000};   // dd, mm, yyyy
//        int[] today = {29, 9, 2025}; // dd, mm, yyyy
//
//        int[] age = calculateAge(dob, today);
//        System.out.println("Age: " + age[0] + " years, " + age[1] + " months, " + age[2] + " days");
//    }
//
//    public static int[] calculateAge(int[] dob, int[] today) {
//        int day = today[0] - dob[0];
//        int month = today[1] - dob[1];
//        int year = today[2] - dob[2];
//
//        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//
//        // Adjust February for leap year if necessary
//        if (isLeap(today[2])) monthDays[1] = 29;
//
//        // Borrow days if current day is less than DOB day
//        if (day < 0) {
//            month--;
//            int prevMonth = today[1] - 2; // previous month index
//            if (prevMonth < 0) prevMonth += 12;
//            day += monthDays[prevMonth];
//        }
//
//        // Borrow months if current month is less than DOB month
//        if (month < 0) {
//            month += 12;
//            year--;
//        }
//
//        return new int[]{year, month, day};
//    }
//
//    public static boolean isLeap(int year) {
//        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//    }
//}
