package Zoho.Pdf110;

public class No_39_Pattern_Shift {
    public static void main(String[] args) {
        int n=2;
        int val=1<<n;
        System.out.println(val);

        for(int i=0;i<val;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                int ans=(i>>j) &1;
                System.out.print(ans+" ");
            }
            System.out.println();
        }

    }
}
