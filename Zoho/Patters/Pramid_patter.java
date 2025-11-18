package Patters;

public class Pramid_patter {
    public static void main(String[] args) {
        int n=3;

        for(int i=1;i<=n;i++)
        {
            for(int s=i;s<n;s++){
                System.out.print("-");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }   // reverse

         for(int i=n-1;i>=1;i--)
        {
            for(int s=i;s<n;s++){
                System.out.print("-");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
