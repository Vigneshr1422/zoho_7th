package GitHub_pradeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_85_LongestConotinous {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,1,2,3,4};
        bubblesort(arr);
        longestContinous(arr);
    }
    public static void bubblesort(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void longestContinous(int []arr)
    {
        int maxLen=1;
        int currlen=1;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1]+1){
                currlen++;
            }
            else if(arr[i]!=arr[i-1]) continue;
            else {
                currlen=1;
            }
            maxLen=Math.max(currlen,maxLen);
        }

        currlen=1;

        List<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]) continue; // skip duplicates
            else if(arr[i] == arr[i-1]+1) temp.add(arr[i]);
            else {
                temp.clear();
                temp.add(arr[i]);
            }

            if(temp.size() == maxLen){
                for(int x : temp) System.out.print(x + " ");
                System.out.println();
            }
        }

    }

}
