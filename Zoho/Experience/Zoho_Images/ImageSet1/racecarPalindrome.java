package Zoho.Experience.Zoho_Images.ImageSet1;

public class racecarPalindrome {
    public static void main(String[] args) {
        String a="racecar";
        int []arr=new int[26];

        for(char s:a.toCharArray())
        {
            arr[s-'a']++;
        }

        int ans=0;

        for(int c:arr)
        {
            if(c%2!=0) ans++;
        }

        System.out.println(ans <=1 ? "true" : "false");
    }
}
