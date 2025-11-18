package set3;


public class expand {
    public static void main(String[] args) {

        String str="a2b3c2";
        System.out.println(function(str));
    }
    public static String function(String str){
        StringBuilder result=new StringBuilder();
        int i=0;
       while(i<str.length()){
        char ch=str.charAt(i);   
        i++;
        StringBuilder store=new StringBuilder();
        while(i<str.length() && Character.isDigit(str.charAt(i))){
            store.append(str.charAt(i));
            i++;
        }

        int count=Integer.parseInt((store.toString()));
        for(int ii=0;ii<count;ii++)
        {
            result.append(ch);
        }
            
       }
        return result.toString();
    }

    public static int integer_parseInt(String x){
        int ans=0;
        int i=0;
        boolean check=false;
        if(x.charAt(i)=='-'){
            check=true;
            i++;
        }

        for(;i<x.length();i++){
            char c=x.charAt(i);
            int rem=c-'0';
            ans=ans*10+rem;
        }
        return check ? -ans :ans;
    }
}
/*
 * package set3;

public class Expand {
    public static void main(String[] args) {
        String str1 = "a[2]b[3]c[2]"; 
        String str2 = "2[a]3[b]2[c]";

        System.out.println(function(str1)); // aabbbcc
        System.out.println(function(str2)); // aabbbcc
    }

    public static String function(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            // Case 1: char first → a[2]
            if (Character.isLetter(str.charAt(i))) {
                char ch = str.charAt(i);
                i++; // move to [
                i++; // skip '['
                StringBuilder num = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num.append(str.charAt(i));
                    i++;
                }
                i++; // skip ']'
                int count = Integer.parseInt(num.toString());
                result.append(String.valueOf(ch).repeat(count));
            }
            // Case 2: number first → 2[a]
            else if (Character.isDigit(str.charAt(i))) {
                StringBuilder num = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num.append(str.charAt(i));
                    i++;
                }
                i++; // skip '['
                char ch = str.charAt(i);
                i++; // move past char
                i++; // skip ']'
                int count = Integer.parseInt(num.toString());
                result.append(String.valueOf(ch).repeat(count));
            }
            else {
                i++;
            }
        }
        return result.toString();
    }
}

 */