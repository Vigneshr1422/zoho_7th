package Zoho.Others;
import java.util.*;

public class String_Lexigrograpical {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String []arr=new String[n];
        for(int i=0;i<n;i++)
        {

            arr[i]=in.nextLine();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(cheak(arr[j],arr[j+1])>0)
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        for(String a:arr)
        {
            System.out.println(a);
        }
    }
    public static int cheak(String i,String j)
    {
        int l=Math.min(i.length(),j.length());
        for(int k=0;k<l;k++)
        {
            if(i.charAt(k)!=j.charAt(k))
            {
                return i.charAt(k)-j.charAt(k);
            }
        }
        return i.length()-j.length();
    }
}
