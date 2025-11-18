package GFG_Experinece;

public class a3_find_missing_positive {
    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        for(int i=0;i<arr.length;i++){
            while (arr[i]> 0 && arr[i]<=arr.length &&arr[arr[i]-1] !=arr[i])  {
                int t=arr[arr[i]-1];
           arr[arr[i]-1]=arr[i];
           arr[i]=t;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
                return;
            }
        }

        System.out.println(arr.length+1);

    }
    
}
