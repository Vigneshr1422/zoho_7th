package KunalKushwaha.BinarySearch.Level1;

public class Peak_Index_in_Mountain_Array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,4,3,2,1};
        int []arr2={0,1,0};
        System.out.println(peakFunction(arr2));
    }
    public static int peakFunction(int []arr ){
        int n=arr.length;

        int s=0;
        int e=n-1;

        while(s<e){
            int m=s+(e-s)/2;

            if(arr[m]<arr[m+1]){
                s=m+1;
            }else{
                e=m;
            }
        }
        return s;
    }
}
