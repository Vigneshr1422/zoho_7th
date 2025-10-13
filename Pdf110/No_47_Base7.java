package Pdf110;

public class No_47_Base7 {
    public static void main(String[] args) {
        int a=14587;
        StringBuilder ans=new StringBuilder();
        while(a!=0)
        {
            int rem=a%7;
            ans.append(rem);
            a/=7;
        }
        System.out.println(ans.reverse());
    }
}
