package Zoho.Pdf110;
/*
  1
 3 2
6 5 4
6 5 4
 3 2
  1
 */
public class No_03_Pattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }

            int num = (i * (i + 1)) / 2;
            for (int j = 0; j < i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }

        numberincreseOrder();

//        for(int i=n;i>=1;i--)
//        {
//            for(int s=i;s<n;s++)
//            {
//                System.out.print(" ");
//            }
//
//            int num=(i*(i+1))/2;
//            for(int j=0;j<i;j++)
//            {
//                System.out.print(num--+" ");
//            }
//            System.out.println();
//        }
//    }
    }

    public static void numberincreseOrder()
    {
        int ans=1;
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int s=i;s<n;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(ans+" ");
                ans++;
            }
            System.out.println();
        }
    }
}