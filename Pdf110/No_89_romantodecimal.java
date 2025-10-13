package Pdf110;
import java.util.*;
public class No_89_romantodecimal {
    public static void main(String[] args) {
        String input="VII";
        function(input);
    }
    public static void function(String str){
        int sum=0;
        HashMap<Character, Integer>ans=new HashMap<>();

        ans.put('I',1);
        ans.put('V', 5);
        ans.put('X', 10);
        ans.put('L', 50);
        ans.put('C', 100);
        ans.put('D', 500);
        ans.put('M', 1000);
        int n=str.length();
        for(int i=0;i<str.length();i++){
            int value=ans.get(str.charAt(i));

            if(i<n-1 && value<ans.get(str.charAt(i+1))){
                sum-=value;
            }else
            {
                sum+=value;
            }
        }
        System.out.println(sum);


    }

}
