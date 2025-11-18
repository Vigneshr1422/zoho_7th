package Zoho.Pdf110;

public class No_20_longestSequence {
    public static void main(String[] args) {
        String a="abcccccbba";

        System.out.println(LongestSequence(a));
    }

    static int longestSeq(String s) {
        int maxLen = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char startChar = s.charAt(i);

            int j = n - 1;
            while (j > i && s.charAt(j) != startChar) j--;

            int len = j - i;
            if (len > maxLen) maxLen = len;
        }

        return maxLen;
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
