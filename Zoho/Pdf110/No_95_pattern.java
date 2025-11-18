package Zoho.Pdf110;

public class No_95_pattern {
    public static void main(String[] args) {
        int n=5;
        int size=2*n-1;   //same as size = n mean not 1234
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
    }
}
