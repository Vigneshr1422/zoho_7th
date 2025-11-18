package Zoho.Experience.Zoho_Images.ImageSet1;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String a="3[a]2[bc]";
        function(a);

    }

    public static void function(String a)
    {
        Stack<Integer>num=new Stack<>();
        Stack<String>str=new Stack<>();
        int n=0;
        String store="";
        for(char x:a.toCharArray()){
            if(Character.isDigit(x)){
                n=n*10+(x-'0');
            }
            else if(x=='['){
                num.push(n);
                str.push(store);
                n=0;
                store="";
            }
            else if(x==']'){
                int k=num.pop();
                StringBuilder sb=new StringBuilder(str.pop());
                while(k-- >0){
                    sb.append(store);
                }
                store=sb.toString();
            }
            else {
                store+=x;
            }
        }
        System.out.println(store);
    }
}
