package Zoho.Experience.lever3;

public class lockerProblem {
    public static void main(String[] args) {
        int n=100;
        boolean []arr=new boolean[n+1];
        for(int i=1;i<=n ;i++)
        {
            for(int j=i;j<=n;j+=i){
                arr[j]=!arr[j];
            }
        }

        System.out.println("Open Locker ");
        for(int i=1;i<=n;i++)
        {
            if(arr[i]){
                System.out.println(i);
            }
        }
    }
}
