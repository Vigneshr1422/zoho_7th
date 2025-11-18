package Zoho.Others;

public class BinaryString {
    public static void main(String[] args) {
        String a="10011";
        String b="11000";

        int x=Integer.parseInt(a,2);
        int y=Integer.parseInt(b,2);
        int ans=x+y;
        String an=Integer.toBinaryString(ans);
        System.out.println(an);
    }
}
