package KunalKushwaha.BinarySearch.Level1;
import java.util.*;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int tar = 8;
        int []ans=function(arr,tar);
        System.out.println(Arrays.toString(ans)); // Output: [3, 4]
    }

    // find first occurrence
    public static int[] function(int[] arr, int tar) {
        int []ans=new int[2];
        ans[0]=searchFirstLast(arr,tar,true);
        ans[1]=searchFirstLast(arr,tar,false);
        return ans;
    }

    // find last occurrence
    public static int searchFirstLast(int[] arr, int tar,boolean check) {
        int start = 0;
        int end = arr.length - 1;
        int ans=-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar) {
                ans=mid;
                if(check){
                    end=mid-1;
                }else {
                    start = mid + 1;
                }
            } else if (arr[mid] < tar) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
