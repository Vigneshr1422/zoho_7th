package Dynamic_Programming;

public class WildcardPattern {
 public static void main(String[] args) {
    String s="abcdef";
    String p="a*d?f";

    boolean ans=wildcard(s,p,0,0);
    if(ans){
        System.out.println("True");
    }else
    {System.out.println("false");
}
 }   

 public static boolean wildcard(String s,String p,int i,int j){
    if(i==s.length() && j==p.length()) return true;
    if(j==p.length()) return false;

    char x=p.charAt(j);

    if(x=='*')
    {
            return (i<s.length() && wildcard(s, p, i+1, j) || wildcard(s, p, i, j+1));
    }
    else if(i<s.length() && (x=='?' || x==s.charAt(i))){
            return wildcard(s, p, i+1, j+1);
        
    }
    else
    {
        return false;
    }
 }
}
