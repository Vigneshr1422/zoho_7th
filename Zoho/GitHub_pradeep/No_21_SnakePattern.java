package Zoho.GitHub_pradeep;

public class No_21_SnakePattern {
    public static void main(String[] args) {
        int  n=5;
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(c+" ");
                if( i%2==0  &&j!=n)
                {
                    c-=1;
                }else if(i%2!=0 &&j!=n  )
                {
                    c+=1;
                }

            }
            c+=n;
            System.out.println();
        }

    }
}
