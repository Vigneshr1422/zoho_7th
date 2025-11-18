package Zoho.Pdf110;

public class No_102_Pattern {
    public static void main(String[] args) {
        int n = 6;

        // outer loop: rows
        for(int i=1;i<=n;i++)
        {
            if(i<=2) System.out.print("* ");

            int num=i;

            for(int j=0;j<=n-i;j++)
            {
                System.out.print(num+" ");
                num+=(n-j);
            }
            System.out.println();
        }
    }
}
/*
* 1 7 12 16 19 21
* 2 8 13 17 20
3 9 14 18
4 10 15
5 11
6
 */