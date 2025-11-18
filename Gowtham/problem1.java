package Gowtham;

public class problem1 {
    public static void main(String[] args) {
        int a=100;
        int b=500;

        Function(a,b);
    }
    public static void Function(int a,int b){
        for(int i=a;i<=b;i++)
        {
            if(check(i)){
                System.out.println(i);
            }
        }
    }
    public static  boolean check(int n)
    {
        int []arr=new int[10];
        while(n!=0)
        {
            int rem=n%10;
            arr[rem]++;
            n/=10;
        }
        for(int i:arr)
        {
            if(i>1){
                return false;
            }
        }
        return  true;
    }
}
