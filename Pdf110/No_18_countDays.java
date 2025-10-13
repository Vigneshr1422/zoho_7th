package Pdf110;

public class No_18_countDays {
    static int []month={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        int []arr={14,10,2025};
        int []arr1={12,10,2025};
        int day1=countDays(arr[0],arr[1],arr[2]);
        int day2=countDays(arr1[0],arr1[1],arr1[2]);

        int ans=day1-day2;
        System.out.println(ans);
    }

    public static int countDays(int d,int m,int y)
    {
        int total=y*365+d;

        for(int i=1;i<=m;i++)
        {
            total+=month[i];
        }
        total+=isLeapYearCount(y,m);

        return total;

    }

    public static int isLeapYearCount(int y, int m)
    {
        if(m>=2) y--;

        return (y/4 - y/100 +y/400);

    }
}
