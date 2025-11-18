package Arrays.BinarySearch;
/*
153. Find Minimum in Rotated Sorted Arrayt
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.


Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.


 */
public class Minimum_rotated_sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(function(arr));

    }
    public static int function(int []arr){
        int start=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;

        if(arr[start]<arr[end]){
            return arr[start];
        }

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[mid])
            {
                ans=Math.min(ans,arr[start]);
                start=mid+1;
            }else
            {
                ans=Math.min(ans,arr[start]);
                end=mid-1;
            }
        }
        return ans;
    }
}
