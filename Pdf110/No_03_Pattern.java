package Pdf110;

public class No_03_Pattern {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int s=i;s<n;s++)
            {
                System.out.print(" ");
            }

            int num=(i*(i+1))/2;
            for(int j=0;j<i;j++)
            {
                System.out.print(num--+" ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int s=i;s<n;s++)
            {
                System.out.print(" ");
            }

            int num=(i*(i+1))/2;
            for(int j=0;j<i;j++)
            {
                System.out.print(num--+" ");
            }
            System.out.println();
        }
    }
}
