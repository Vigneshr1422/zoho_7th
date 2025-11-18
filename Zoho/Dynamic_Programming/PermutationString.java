package Dynamic_Programming;

public class PermutationString {
    public static void main(String[] args) {
        String a="ABC";
        char []arr=a.toCharArray();

        Permute(arr,0,a.length()-1);
    }
    public static void Permute(char []arr,int left , int right)
    {
        if(left==right){
            System.out.println(new String(arr));
        }

        for(int i=left;i<=right;i++){
            swap(arr,left,i);
            Permute(arr, left+1, right);
            swap(arr,left,i);

        }

       
    }
     public static void swap(char[]arr,int start,int end)
        {

            char t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
        
        }
}
