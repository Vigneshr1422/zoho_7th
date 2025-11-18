package set8;

public class subString {
    public static void main(String[] args) {
        String a="ABC";

        for(int i=0;i<a.length();i++){
            String ans="";
            for(int j=i;j<a.length();j++){
                ans+=a.charAt(j);
                System.out.println(ans);
            }
        }
    }
    
}
