package Zoho.GitHub_pradeep;


public class No_97_max_subArray_sum {
    public static void main(String[] args) {
        int []arr={-2,-3,4,-1,-2,5,3};
        int n=arr.length;

        int max=arr[0];
        int curr=arr[0];
        int s=0;
        int e=0;
        int tempstart=0;
        for(int i=1;i<n;i++){
            if(arr[i]>curr+arr[i]){
                curr=arr[i];
                tempstart=i;
            }else{
                curr=curr+arr[i];
            }
            if(curr>max){
                max=curr;
                s=tempstart;
                e=i;
            }
        }
        System.out.println("Max "+max);
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
    }

}

