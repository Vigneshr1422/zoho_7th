package GFG_Experinece;

public class a4_LongestDistinctOptimal{
    public static void main(String[] args) {
        String a="abcabcbb";
        boolean check[]=new boolean[256];
        int n=a.length();
        int left=0;
        int maxlen=0;

        for(int i=0;i<n;i++)
        {
            char c=a.charAt(i);
            while(check[c])
            {
                check[a.charAt(left)]=false;
                left++;

            }

            check[c]=true;
            maxlen=Math.max(maxlen,left-i+1);
        }
    }
    
}
