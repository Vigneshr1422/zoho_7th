package set2;

import java.util.Arrays;


public class alternativesort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        optimal();
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
    
    public static void optimal()
    {
                int arr[]={1,2,3,4,5,6};

        int minIndx=0;
        int maxIndx=arr.length-1;
        int maxElement=arr[arr.length-1]+1;

        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0){
                arr[i]=arr[i]+(arr[maxIndx]%maxElement)*maxElement;
                maxIndx--;
            }else{
  arr[i]=arr[i]+(arr[minIndx]%maxElement)*maxElement;
                minIndx++;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/maxElement;
        }

        System.out.println(Arrays.toString(arr));
    }
}
