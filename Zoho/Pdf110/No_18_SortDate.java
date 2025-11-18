package Zoho.Pdf110;

import java.util.Arrays;
import java.util.Scanner;

public class No_18_SortDate {

   static int []monthDate={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []arr=new int[3];
        System.out.println("Enter 1 date");
        arr[0]=in.nextInt();

        System.out.println("Enter 1 month ");
        arr[1]=in.nextInt();

        System.out.println("Enter 1 year");
        arr[2]=in.nextInt();

        System.out.println(Arrays.toString(arr));
        int d1=DateFun(arr);


        int []arr2=new int[3];
        System.out.println("Enter 2 date");
        arr2[0]=in.nextInt();

        System.out.println("Enter 2 month ");
        arr2[1]=in.nextInt();

        System.out.println("Enter 2 year");
        arr2[2]=in.nextInt();

        System.out.println(Arrays.toString(arr));
       int  d2=DateFun(arr2);

        System.out.println(Math.abs(d1-d2));
    }

    public static int DateFun(int []arr)
    {
        int de=arr[0];
        int month=arr[1];
        int year=arr[2];
        int dates=de;
        for(int i=1;i<month;i++)
        {
            dates += monthDate[i];
            if(i == 2 && isLeap(year)) dates++; // Feb in leap year
        }

        for(int i=0;i<year;i++)
        {
            dates+=isLeap(i)?366:365;
        }
        return  dates;
    }
    public static boolean isLeap(int n)
    {
        return  ((n%4==0 && n%100!=0 )|| (n%400==0));
    }
}
