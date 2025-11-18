package Patterns;

import java.util.*;

public class MultipleTriangles {
    public static void main(String[] args) {
        function(3);
    }

    public static void function(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                for(int s=1;s<=n-i;s++){
                    System.out.print(" ");
                }

                for(int s=1;s<=2*i-1;s++)
                {
                    System.out.print("*");
                }
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
