package set7;
import java.util.*;
public class date_sorting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        String []date=new String[n];
        for(int i=0;i<n;i++){
            date[i]=in.nextLine();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(function(date[j],date[j+1])>0){
                    String t=date[j];
                    date[j]=date[j+1];
                    date[j+1]=t;

                }
            }
        }

         System.out.println("Sorted dates:");
        for (String d : date) {
            System.out.println(d);
        }


       
    }
     public static int function(String d1, String d2){
           int day1=Integer.parseInt(d1.substring(0,2));
           int day2=Integer.parseInt(d2.substring(0,2));

           int month1=Integer.parseInt(d1.substring(3,5));
           int month2=Integer.parseInt(d2.substring(3,5));

        int year1 = Integer.parseInt(d1.substring(6));
        int year2 = Integer.parseInt(d2.substring(6));


        if(year1!=year2){
            return year1-year2;
        }
        if(month1!=month2){
            return month1-month2;
        }
        return day1-day2;

        }
}
