package Arrays.BinarySearch;
/*
33. Search in Rotated Sorted Array  Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1

 */
public class Search_rotated_sortedArray {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int tar=0;
        System.out.println(function(arr,tar));
    }
    public  static int function(int []arr, int tar)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar)
                return mid;
            if (arr[start] <= mid) {
                if (arr[start] <= tar && tar <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= tar && tar <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return  -1;
    }
}
