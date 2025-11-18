package Zoho.Others;
import java.util.*;
public class sum_product_max {
    public static void main(String[] args) {
        int []arr={20,24,71,10,59};
        int []ans=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int sum=0;
            int pro=1;

            if(num==0)
            {
                ans[i]=0;
                continue;
            }
            while(num!=0)
            {
                int rem=num%10;
                sum+=rem;
                pro*=rem;
                num/=10;
            }
            ans[i]=Math.max(sum,pro);
        }
        System.out.println(Arrays.toString(ans));
    }
}
