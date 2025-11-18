package GFG_Experinece;
public class a2_Substring_disnict_K {
    public static void main(String[] args) {
        String str="abcabc";
        int k=3;
        System.out.println(function(str,k));
    }

    public static int function(String s,int k)
    {
        return countFun(s,k)-countFun(s,k-1);
    }
    public static int countFun(String str , int k)
    {
        int []arr=new int[256];
        int n=str.length();
        int left=0;
        int ans=0;
        int dist=0;
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(arr[c]==0){
                dist++;
            }
            arr[c]++;
            while(dist>k){
                char x=str.charAt(left);
                arr[x]--;
                if(arr[x]==0)
                {
                    dist--;
                }
                left++;
            }
        ans =ans + i - left + 1;  // ✅ Count substrings ending at i
        }
            return ans;   
    }
}
