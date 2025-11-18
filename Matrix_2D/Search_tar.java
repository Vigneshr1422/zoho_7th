package Matrix_2D;

public class Search_tar {
    static int tar=5;

    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println( bruteForce(arr));
        System.out.println(optimal(arr));
    }

    public static boolean optimal(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        int start=0;
        int end=n*m-1;
        while(start<end){
            int mid=start+(end-start)/2;
            int val=arr[mid/m][mid%m];
            if(val==tar){
                return true;
            }else if(val<tar){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public static  boolean bruteForce(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        for (int[] ints : arr) {
            for (int j = 0; j < m; j++) {
                if (ints[j] == tar) {
                    return true;
                }
            }
        }
        return false;
    }
}
