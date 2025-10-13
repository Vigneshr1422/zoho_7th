package Patterns;
/*
1  2  3  4  5
10 9  8  7  6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25

 */
public class SnakePattern {
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
