package GitHubQuestions;

import java.util.Arrays;

public class a5_a4_alternativeSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int s=0;
        int end=arr.length-1;
        
        int res[]=new int[arr.length];
        int idx=0;

        while (s<=end) {

            if(idx<arr.length){
                res[idx++]=arr[end--];
            }
            if(idx<arr.length){
                res[idx++]=arr[s++];
            }
            
        }
        System.out.println(Arrays.toString(res));
    }
    
}
