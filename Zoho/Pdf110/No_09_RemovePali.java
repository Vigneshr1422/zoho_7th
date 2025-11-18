package Zoho.Pdf110;

import java.util.Arrays;

public class No_09_RemovePali {
    public static void main(String[] args) {
        String a="he knows the malayalam";
        String []arr=a.split(" ");
        System.out.println(Arrays.toString(arr));

        for(String i:arr)
        {
            if(!isPali(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static  boolean isPali(String a)
    {
        int s=0;
        int e=a.length()-1;
        while(s<e)
        {
            if(a.charAt(s)!=a.charAt(e))
            {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
