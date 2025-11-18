package Zoho.Others;
import java.util.*;
public class factor_asending {
    public static void main(String[] args) {
        int []arr={8,12,3,12,16};
        int []ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
           ans[i]=factor(arr[i]);
        }


        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(ans[j]<ans[j+1])
                {
                    int tempAns=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=tempAns;

                    int tempArr=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tempArr;
                }
            }
        }

        System.out.println(Arrays.toString(ans));


        for(int n:arr)
        {
            System.out.print(n+" ");

        }

    }
    public static int factor(int n)
    {
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    c++;
                } else {
                    c += 2;
                }
            }
        }
        return c;
    }
}
