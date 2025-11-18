package Zoho.Pdf110;

public class No_100_ThreshHold {
    public static void main(String[] args) {
        int []arr={5,8,10,13,6,2};
        int tar=3;
        int ans=0;

        for(int i:arr)
        {
            ans+=(i+tar-1)/tar;
        }

        System.out.println(ans);
    }
}
