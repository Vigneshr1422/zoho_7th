package Zoho.Others;

public class hallow_rectangle {
    public static void main(String[] args) {
        int n=6;
        int m=6;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1||  j==m-1)
                {
                    System.out.print("X ");
                }else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }
}
