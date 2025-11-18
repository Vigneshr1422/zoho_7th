package Mathemetics;
import java.util.*;
public class palindrome_cheak {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter  a number ");
        int n=in.nextInt();

        for(int i=0;i<n;i++)
        {
            if(pali(i)){
                System.out.println(i);
            }
        }


        in.close();


    }
    public static boolean pali(int n)
    {
        int temp=n;
        int res=0;
        for(int i=0;i<n;i++)
        {
            while(temp!=0)
            {
                res=res*10+temp%10;
                temp=temp/10;
            }
        }
        if(res==n)
        return true;
        else
        return false;

       
    }
}

  

