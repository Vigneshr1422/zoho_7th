package GitHub_pradeep;

public class DayFinder {
    public static void main(String[] args) {
        int []arr={22,8,2003};
        findDay(arr);
    }
    public static void findDay(int []arr)
    {
        String []x={"sat","sun","mon","tues","wed","thurs","frid"};
        int day=arr[0];
        int month=arr[1];
        int year=arr[2];
        if(month<3)
        {
            month+=12;
            year--;
        }
        int yLast=year%100;
        int yFirst=year/100;
        int ans=day+yLast+(yLast/4)+(yFirst/4)+(13*(month+1)/5)+5*yFirst;
        System.out.println(x[ans%7]);
    }
}
