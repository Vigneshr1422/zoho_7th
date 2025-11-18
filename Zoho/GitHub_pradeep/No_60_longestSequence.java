package Zoho.GitHub_pradeep;

public class No_60_longestSequence {
    public static void main(String[] args) {
        String a="abcccccbba";

        System.out.println(LongestSequence(a));
    }

    public static int LongestSequence(String a)
    {
        int ans=0;
        int []arr=new int[26];
        for(int i=0;i<26;i++) arr[i]=-1;

        for(int i=0;i<a.length();i++)
        {
            int j=a.charAt(i)-'a';

            if(arr[j]==-1) {
                arr[j]=i;
            }else
            {
                ans=Math.max(ans,i-arr[j]-1);
            }
        }
        return ans;
    }
}
