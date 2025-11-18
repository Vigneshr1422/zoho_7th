package Zoho.Others;
import java.util.*;

//28
public class rever_String {
    public static void main(String[] args) {
        String a = "This is test and for  String ";
        String b = "is";
        String[] arr = a.split("\\s+");

        int startindex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].contains(b))
            {
                startindex=i;
                break;
            }
        }

        if(startindex!=-1)
        {
            int start=startindex;
            int end=arr.length-1;

            while(start<end)
            {
                String temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        String res=String.join(" ",arr);
        System.out.println(res);
    }
}
