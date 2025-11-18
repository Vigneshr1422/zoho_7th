package Arrays.subArray;
/*
Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
public class maximum_product_subarray {
    public static void main(String[] args) {
        int []arr={2,3,-2,4};
        int left=1;
        int right=1;
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            left=left==0?1:left;
            right=right==0?1:right;

            left*=arr[i];
            right*=arr[arr.length-1-i];
            max=Math.max(max,Math.max(left,right));
        }
        System.out.println(max);
    }
}
