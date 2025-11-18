package Zoho.Experience.Zoho_Images.ImageSet1;

public class concentric {
    /*
3 3 3 3 3 
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
     */
    public static void main(String[] args) {
        int n=6;

        int size=2*n-1;

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                int bottom=size-1-i;

                int right=size-1-j;

                int min=Math.min(Math.min(i,bottom),Math.min(j,right));

                System.out.print(n-min+" ");
            }
            System.out.println();
        }

        func(n);
    }


    /*
     * 
     * 
666666
655556
654456
654456
655556
666666
     */

    public static void func(int  n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int min=Math.min(Math.min(i,j),Math.min(n-i-1,n-j-1));
                System.out.print(n-min);
            }
            System.out.println();
        }
    }
    
}
