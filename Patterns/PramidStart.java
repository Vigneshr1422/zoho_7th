package Patterns;
/*
Input Format: N = 3
Result:
  *
 ***
*****
Input Format: N = 6
Result:
     *
    ***
   *****
  *******
 *********
***********
 */
public class PramidStart{
    public static void pattern1(int n)
    {
        // ithula output vanthu
        /*
        first space + star + space
         */

        for(int i=0;i<n;i++) {
            /*space */
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            /*Star */
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            /*space */
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void pattern2invert(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++) // space
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*n -(2*i+1);j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<i;j++) // space
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void pattern3(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern2invert(5);
        pattern3(5);
        pattern4(5);

    }
}
