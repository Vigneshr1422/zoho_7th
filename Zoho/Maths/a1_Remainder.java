package Maths;

public class a1_Remainder {
    public static void main(String[] args) {
        String a="14523874114587452";
        int rem=6;

        System.out.println("Answer is "+function(a,rem));
    }
    public static int function(String a,int r){
        int ans=0;
        
        for(int i=0;i<a.length();i++){
            int rem=a.charAt(i)-'0';
            ans=(ans*10+rem )%r;
        }

        return ans;
    }
}
