package Maths;

public class a7_fraction {
    public static void main(String[] args) {
        a6_lcmofanyNumber ob1=new a6_lcmofanyNumber();
       
        int a=97;
        int b=11;

        int ans= ob1.gcd(a,b);

        a=a/ans;
        b/=ans;
        System.out.println(a+"/"+b);
    }
    
}
