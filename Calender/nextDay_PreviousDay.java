package Calender;
public class nextDay_PreviousDay {
    public static int []mdate={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        int[] arr = {30,9,2003};
        NextDay(arr);
        PreviousDay(arr);
    }
    public static void NextDay(int []arr)
    {
        int day=arr[0];
        int month=arr[1];
        int year=arr[2];
        if (month==2 && isLeap(year))
        {
            mdate[1]=29;
        }
        day++;
        if(day>mdate[month]){
            day=1;
            month++;
            if(month>12)
            {
                month=1;
                year++;
            }
        }
        System.out.println(" date month year "+day+" "+month+" "+year);
    }
    public static boolean isLeap(int y)
    {
        return (y%4 ==0 && y%100!=0 ) || y%400==0;
    }
    public static void PreviousDay(int []arr)
    {
        int day=arr[0];
        int month=arr[1];
        int year=arr[2];
        if (month==2 && isLeap(year))
        {
            mdate[1]=29;
        }
        day--;
        if(day>mdate[month]){
            day=1;
            month--;
            if(month>12)
            {
                month=1;
                year--;
            }
        }
        System.out.println(" date month year "+day+" "+month+" "+year);
    }
}