package subarray;
/*
    Array: {1, 0, 0, 1, 0}
Original Count of 1s:

Before any operation, there are 2 ones (1 and 1 at indices 0 and 3).
Choosing Subarray:

Subarray [1, 2] contains 0, 0. Flipping it gives {1, 1, 1, 1, 0}.
New count of 1s = 4.
Result: Maximum possible ones after flipping is 4.

Input Example 2:
Array: {0, 0, 0, 0, 0}
Original Count of 1s:

Before any operation, there are 0 ones.
Choosing Subarray:

Flipping the entire array gives {1, 1, 1, 1, 1}.
Result: Maximum possible ones after flipping is 5.

 */
public class flipbits {
    public static void main(String[] args) {
        int []arr={1,0,0,1,0};

        int ans=fun(arr);
        System.out.println("Answer is "+ans);
    }
    public static int fun(int[]arr)
    {
        int onesum=0;
        int ans=Integer.MIN_VALUE;
        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            int k;
            if(arr[i]==1)
            {
                onesum++;
                k=-1;  // 1 --> 0
            }
            else
            {
                k=1; // 0-->1 
            }
            max=Math.max(max, max+k);
            ans=Math.max(ans, max);
        }
        ans=Math.max(0, max); // non negative 
        return ans+onesum;
    } 
    
}
