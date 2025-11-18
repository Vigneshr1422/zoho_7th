package Zoho.Pdf110;

public class No_55_Add_Sub_Mul_Div {
    public static void main(String[] args) {
        int a=7;
        int b=-2;

        Operatro(a,b);

    }

    public static void Operatro(int a , int b )
    {
        int add =a+b;
        int sub=a+(-b);
        int mul=0;
        for(int i=1;i<=b;i++)
        {
            mul=mul+a;
        }
        mul=b<0 ? -mul:mul;

        System.out.println(add+" "+sub+" "+mul+" ");

        divide(a,b);


    }
    public static void divide(int a,int b)
    {
        if(b==0) throw  new ArithmeticException("Po da");
        int c=0;
        int aba=a<0 ? -a :a;
        int abb=b<0 ? -b:b;

        int sum=abb;
        while(sum+abb<=aba)
        {
            sum+=abb;
            c++;
        }
        System.out.println(c);
    }
}
