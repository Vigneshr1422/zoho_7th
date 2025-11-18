package Array;
/*
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class twosum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target =9;
        int []ans=function(arr,target);
        for(int j:ans)
        {
            System.out.print(j+" ");
        }
    }
    public static int[] function(int []ans,int tar)
    {
        int arr[]=new int[2];
        for(int i=0;i<ans.length;i++)
        {
            for(int j=i+1;j<ans.length;j++)
            {
                if(tar==ans[i]+ans[j])
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
