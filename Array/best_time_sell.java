package Array;

public class best_time_sell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};

        int ans=code1(arr);
        int ans1=code2(arr);
        System.out.println("The answer one is "+ans+" \nthe answer of the second code "+ans1);
    }
    public static int code1(int []arr)
    {

        int max=0;
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else
            {
                max=Math.max(max,arr[i]-min/*profit*/);
            }
        }
        return max;
    }
    /*
     Example 1:
    Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
     */

    public static int code2(int []arr)
    {
        int min=arr[0];
        int maxprofit=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)

            {
                min=arr[i];
            }
            else
            {
                maxprofit=maxprofit+arr[i]-min;
                min=arr[i];
            }
        }
        return maxprofit;
    }
    
}
