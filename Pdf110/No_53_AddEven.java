package Pdf110;

public class No_53_AddEven {
    public static void main(String[] args) {
       function();
       Unique();
}
public static void function()
{
    int a=1452874;
    int odd=0;
    int even=0;

        while(a!=0) {
        int rem = a % 10;
        if (rem % 2 == 0) {
            even++;
        }else {
            odd++;
        }
        a/=10;
    }
        System.out.println(odd+" "+even);
 }
 public static void Unique()
 {
     int a=1452874;
     int odd=0;
     int even=0;
     boolean []ch=new boolean[9];

     while(a!=0) {
         int rem = a % 10;

         if(!ch[rem]) {
             ch[rem]=true;
             if (rem % 2 == 0) {
                 even++;
             } else {
                 odd++;
             }
         }
         a/=10;
     }
     System.out.println(odd+" "+even);

 }
}

