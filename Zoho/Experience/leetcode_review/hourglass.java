package leetcode_review;
import java.util.*;

public class hourglass {
        public static void main(String[] args) {
        int [][]arr=new int[3][3];
        Scanner in=new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                arr[i][j]=in.nextInt();
            }
        }


        for(int []a:arr)
        {
            for(int k:a)
            {
                System.out.print(k+" ");
            }

            System.out.println();
        }

        int maxSum=0;
        int n=3;
        int m=3;
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=m-3;j++){
                int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            
            if(maxSum<sum)
            {
                maxSum=sum;
            }
        }
        }
        System.out.println(maxSum);
    }
    
}
