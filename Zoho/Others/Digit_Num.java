package Zoho.Others;
import java.util.*;
public class Digit_Num {
    public static void main(String[] args) {
        int digit=4;
        int num=492;

        String x=String.valueOf(num);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<x.length();i++)
        {
            int y=x.charAt(i)-'0'; // integer value
            int add=y+digit;
            ans.append(add);
        }
        System.out.println(ans.toString());
    }
}
