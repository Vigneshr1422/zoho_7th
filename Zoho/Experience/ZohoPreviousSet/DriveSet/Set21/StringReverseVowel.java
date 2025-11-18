package Zoho.Experience.ZohoPreviousSet.DriveSet.Set21;

public class StringReverseVowel {
    public static void main(String[] args) {
        String a="hello";
        System.out.println(RevFunction(a));
    }
    public static String RevFunction(String a)
    {
        int n=a.length();

        int s=0;
        int e=n-1;
        char []arr=a.toCharArray();
        while(s<e)
        {
            while(s<e && !isVowel(arr[s]) )
                s++;
            while(s<e && !isVowel(arr[e]))
                e--;

            char x=arr[s];
            arr[s]=arr[e];
            arr[e]=x;
            s++;
            e--;
            
        }
        return new String(arr);
    }

    public static boolean isVowel(char x){
        String vowel="aeiouAEIOU";
        return vowel.indexOf(x)!=-1;
    }
}
