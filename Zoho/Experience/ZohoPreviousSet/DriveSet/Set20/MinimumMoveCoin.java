package Zoho.Experience.ZohoPreviousSet.DriveSet.Set20;

public class MinimumMoveCoin {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int even=0;
        int odd=0;
        for (int i:arr){
            if(i%2==0) even++;
            else{
                odd++;
            }
        }
        System.out.println(Math.min(odd,even));
    }
}
