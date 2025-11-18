package GitHubQuestions;

import java.util.Arrays;

public class a5_a26_factor_basedAssedning {
    public static void main(String[] args) {
        int []arr={8,12,3,12,3};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(factor(arr[j]) < factor(arr[j+1]))
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static int factor(int n)
    {   int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0)
            {
                if(i==n/i)
                c++;
                else
                c+=2;
            }
        }
        return c;
    }
}
