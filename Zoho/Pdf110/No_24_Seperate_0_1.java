package Zoho.Pdf110;

import java.util.Arrays;

public interface No_24_Seperate_0_1 {
    public static void main(String[] args) {
        int []arr={0,1,0,0,1,0,1,1};
        for(int i:arr)
        {
            if(i==0)
            {
                System.out.print(i+" ");
            }
        }
        for(int i:arr)
        {
            if(i!=0)
            {
                System.out.print(i+" ");
            }
        }
        optimal();
    }

    public static void optimal()
    {
        int []arr={1,0,0,0,0,0,0,0,0,1};

        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
