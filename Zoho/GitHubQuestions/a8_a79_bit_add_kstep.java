package GitHubQuestions;

import java.util.Arrays;

public class a8_a79_bit_add_kstep {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1,1,0,1,1,1,1};
        int k=2;
        int res[]=function(arr,k);
        System.out.println(Arrays.toString(res));

    }

    public static int[] function(int []arr,int k)
    {
        int zero=0;
        int c=0;
        for(int x:arr)
        {
            if(x==1){
                c++;
            }else
            {
                c=0;
            }

            if(c==k)
            {
                zero++;
                c=0;
            }
        }

        int res[]=new int[arr.length+zero];

        int i=0;
         c=0;

         for(int x:arr){
            res[i++]=x;

            if(x==1){
                c++;
            }else{
                c=0;
            }
            if(c==k){
                res[i++]=0;
                c=0;
            }
         }

         return res;

    }
}
