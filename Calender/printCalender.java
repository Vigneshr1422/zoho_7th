package Calender;

public class printCalender {
    public static void main(String[] args) {
        int[] arr = {10, 8, 2003}; // dd, mm, yyyy
        printCalander(arr);
    }

    // Zeller's congruence to find day of week
    public static int ShowCalander(int date, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int lastYear = year % 100;
        int firstYear = year / 100;

        int ans = date + (13 * (month + 1)) / 5 + lastYear + lastYear / 4 + firstYear / 4 + 5 * firstYear;
        return ans % 7; // 0=Saturday, 1=Sunday, ...
    }

    public static void printCalander(int []arr) {
        String[] months = {"","Janu ary","February","March","April","May","June",
                "July","August","September","October","November","December"};
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (isLeap(arr[2])) daysInMonth[2] = 29;

        System.out.println("\n " + months[arr[1]] + " " + arr[2]);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int month = arr[1];
        int year = arr[2];
        int startDay = ShowCalander(1, month, year);
        startDay = (startDay + 6) % 7; // shifting to Sunday=0

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int i = 1; i <= daysInMonth[month]; i++) {
            System.out.printf("%2d ", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
        System.out.println("\n");
    }

    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}
/*
public class Main
{
    public static void main(String[] args) {
        int []arr={22,8,2003};
        showCalander(arr);
    }

    public static void showCalander(int []arr)
    {
        int day=arr[0];
        int mon=arr[1];
        int year=arr[2];

        String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if(isLeap(year))
        {
            daysInMonth[2]=29;
        }

        System.out.println(months[mon]+" "+year);

        System.out.println("Su Mo Tu We Th Fr Sa");


        int spacDay=formuladate(1,mon,year);
        spacDay=(spacDay+6)%7;

        for(int i=0;i<spacDay;i++)
        {
            System.out.print("   ");
        }

        for(int i=1;i<=daysInMonth[mon];i++)
        {
            System.out.printf("%2d ",i);
            if((i+spacDay)%7==0) System.out.println();
        }
    }
    public static int formuladate(int date,int mon,int year)
    {
        if(mon<3)
        {
            mon+=12;
            year--;
        }
        int ylast=year%100;
        int yfist=year/100;

        int ans=date+(13*(mon+1))/5+ylast+ylast/4+yfist/4+5*yfist;

        return ans%7;
    }

    public static boolean isLeap(int y)
    {
        return (y%4==0 && y%100!=0) || y%400==0;
    }
}
 */