package Problem_Solving.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String a="madam";
        System.out.println(pali(a,0,a.length()-1));
    }
    public static boolean pali(String a,int s,int n){
            if(s>=n/2){
                return true;
            }
            if(a.charAt(s)!=a.charAt(n-s-1)){
                return  false;
            }
            return pali(a,s+1,n);
    }
}
