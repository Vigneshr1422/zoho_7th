package Zoho.Experience.GFG_Experinece;

public class no_of_goodPairs {
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        int max=0;
        for(int x:arr)
        {
            if(max<x){
                max=x;
            }
        }

        int ans[]=new int[max+1];
        int answer=0;
        for(int  x: arr)
        {
            answer=answer+ans[x];
            ans[x]++;

        }
        System.out.println(answer);
    }
}
