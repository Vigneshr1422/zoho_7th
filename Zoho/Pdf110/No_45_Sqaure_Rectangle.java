package Zoho.Pdf110;

import java.util.Arrays;

public class No_45_Sqaure_Rectangle {
    public static void main(String[] args) {
        int [][]arr={
                {0,0},
                {0,2},
                {2,0},
                {2,2}
        };
        System.out.println(FindShap(arr));
    }

    public static String FindShap(int [][]arr)
    {
        int []ans=new int[6];
        int k=0;
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                ans[k++]=formula(arr[i][0],arr[i][1],arr[j][0],arr[j][1]); // 6 point generate aguthu
            }
        }
        Arrays.sort(ans);
        boolean side=(ans[0]>0)&&ans[0]==ans[1] && ans[1]==ans[2]&& ans[2]==ans[3];
        boolean diagonal=(ans[4]==ans[5]);
        if(side==diagonal){
            return "Square";
        }
        if(ans[0]==ans[1] && (ans[2]==ans[3])) return "Recatnge";
        return "Other";
    }
    public static int formula(int x1,int y1,int x2,int y2)
    {
        return (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
    }
}