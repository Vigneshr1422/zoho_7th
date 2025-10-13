package Calender;

public class No_of_Days {
    public static void main(String[] args) {
        int []arr={28,2,2020};

        int mon=arr[1];
        int year=arr[2];
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        int d=arr[0];
        if(mon==2 &&isLeap(year))
        {
            System.out.println("29");
            return;
        }
        System.out.println(daysInMonth[mon]);
    }
    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}
