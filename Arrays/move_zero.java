package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class move_zero {
    public static void main(String[] args) {
        int []arr={1,2,0,3,0,12,0};

        int []arr1={14,0,25,19,10,336,0,147,0,25,0,0,2,51,0};
        move0(arr1);
        movezero_rev(arr1);

        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();

        for(int i:arr)
        {
            if(i!=0)
            {
                a.add(i);
            }else {
                b.add(i);
            }
        }

        ArrayList<Integer>ans=new ArrayList<>(b);
        ans.addAll(a);

        System.out.println(ans);

    }

    public static void move0(int []arr)
    {
        int n=arr.length;
        int j=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j++]=arr[i];
            }
        }

        while(j<n)
        {
            arr[j++]=0;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void movezero_rev(int []arr) {
        int n = arr.length;
        int j = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j--] = arr[i];
            }
        }

        while (j >=0){
            arr[j--]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
