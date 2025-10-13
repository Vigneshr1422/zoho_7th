package Zoho_Round2_Experince;

import java.util.ArrayList;

public class BackTracking_1 {
    public static void main(String[] args) {
        int sum=10;
        int digit=3;
        ArrayList<Integer>ans=new ArrayList<>();
        int pos=0;
        int start=0;
        BackTrack(ans,pos,sum,digit,start);
    }
    public  static void BackTrack(ArrayList<Integer>ans,int pos,int sum,int digit,int start)
    {
        if(pos==digit)
        {
            if(sum==0)
            {

            }
        }
    }
}
