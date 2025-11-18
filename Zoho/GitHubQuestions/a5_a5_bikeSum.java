package GitHubQuestions;

import java.util.Arrays;

public class a5_a5_bikeSum {

    public static void main(String[] args) {
        int []arr={30,50,70,80};
        int k=100;

        int ans=0;
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);

        while(i<j)
        {
            if(arr[i]+arr[j]<=k)
            {
                i++;
            }else
            {
                j--;
            }
            ans++;
        }
        System.out.println(ans);
    }
}