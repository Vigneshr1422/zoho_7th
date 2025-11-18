package Zoho.Others;

public class pramid_pattern {
    public static void main(String[] args) {
        int n=5 ;

        for(int i=1;i<=n;i++)
        {
            int num=i;
            for(int j=1;j<=n+i-1;j++)
            {
                if(j<=n-i)
                {
                    System.out.print("_ ");
                }else if(j<=n)
                {
                    System.out.print(num+++" ");
                }else
                {
                    System.out.print(--num-1+" ");
                }
            }
            System.out.println();
        }
    }
}
