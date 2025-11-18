package set15;
public class reverseWord{
    public static void main(String[] args) {
    String str="one two three";
    reverse(str,0,"");    
    }

    public static void reverse(String str,int index, String ans){
        if(index==str.length()){
            System.out.println(ans);
            return ;
        }

        char ch=str.charAt(index);
        if(ch==' '){
            reverse(str, index+1, "");
            System.out.println(" "+ans);
        }else{
            reverse(str, index+1, ans+ch);
        }
    }
}