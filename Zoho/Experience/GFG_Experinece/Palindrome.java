package GFG_Experinece;
/*
 .Given a String with or without special characters find if it is Palindrome or Not..
 */
public class Palindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";

        System.out.println(check(s));

    }

    public static boolean check(String str)
    {
        int s=0;
        int end=str.length()-1;

        while(s<end){
            while(s<end && !letterORdigit(str.charAt(s))){
                s++;
            }
            while(s<end && !letterORdigit(str.charAt(end))){
                end--;
            }
            if(lower(str.charAt(s))!=lower(str.charAt(end))){
                return false;
            }
            s++;
            end--;

        }

        return true;
    }

    public static boolean letterORdigit(char x){
        return (x>='a' && x<='z' ||
                x>='A' && x<='Z'||
                x>='0' && x<='9');
    }

    public static char lower(char x){
        if(x>='A' && x<='Z'){
            return (char)(x-'A' +'a');
        }

        return x;
    }
}
