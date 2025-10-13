package GitHub_pradeep;

import java.util.Arrays;

public class No_73_sort_arraydescending_frequencybase {
    public static void main(String[] args) {
        int []arr={2,2,3,4,5,12,1,2,2,3,3,15};
        int x=0;

        for (int k : arr) {
          if(x<k)
          {
              x=k;
          }
        }
        int []ans=new int[x+1];

        for(int l:arr)
        {
            ans[l]++;
        }


        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(ans[arr[i]]<ans[arr[j]])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }else if(ans[arr[i]]==ans[arr[j]] && arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
