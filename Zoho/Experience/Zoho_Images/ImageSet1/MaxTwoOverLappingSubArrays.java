package Zoho.Experience.Zoho_Images.ImageSet1;
/*
4.Find maximum Sum of Two Non-Overlapping Subarrays Given an unsorted array All of non-negative integers,
 return the maximum sum of elements in two non-overlapping (contiguous) subarrays, which have lengths L and M.
  The L-length subarray could occur before or after the M-length subarray Test case 1: Enter the array size:
  9 Input array: [0,6,5,2,2,5,1,9,4] , L = 1, M = 2 Output: 20
  Explanation: One choice of subarrays is [9] with length 1, and [6,5] with length 2.
  Test case 2: Enter the array size: 9 Input array: [3,8,2,3,2,1,8,9,0], L = 3, M = 2 Output: 30 \
  Explanation: One choice of subarrays is [3,8,2] with length 3, and [8,9] with length 2.
  Test case 3: Input array: [2,1,2,3,5,6,1,0,8,9], L = 4, M = 2 Output: 33
  Explanation: One choice of subarrays is [2,3,5,6] with length 4, and [8,9] with length
 */
public class MaxTwoOverLappingSubArrays {
    public static void main(String[] args) {
        int []arr={0,6,5,2,2,5,1,9,4};
        int l=1;
        int m=2;

        System.out.println(maxOverLa(arr,l,m));

    }

    public static int maxOverLa(int []arr,int l,int m)
    {
        int n=arr.length;
        int []ans=new int[n+1];

        for(int i=0;i<n;i++)
        {
            ans[i+1]=ans[i]+arr[i];
        }

        return Math.max(helper(ans,l,m),helper(ans,m,l));
    }

    public static int helper(int []ans, int l , int m)
    {
            int n=ans.length-1;
            int maxL=0;
            int res=0;

            for(int i=l+m;i<=n;i++)
            {
                maxL=Math.max(maxL,ans[i-m]-ans[i-m-l]);

                int maxM=ans[i]-ans[i-m];

                res=Math.max(res,maxM+maxL);

            }

            return res;
    }
}
/*
Case 1: helper(prefix, L=1, M=2)

We slide through i = L + M = 3 to n = 9.

i	maxL (best 1-length sum before i-M)	M-sum (2-length ending at i)	result (maxL + sumM)
3	prefix[1]-prefix[0]=0 → maxL=0	prefix[3]-prefix[1]=11-0=11	0+11=11
4	prefix[2]-prefix[1]=6-0=6 → maxL=6	prefix[4]-prefix[2]=15-11=2	6+2=8
5	prefix[3]-prefix[2]=13-6=7 → maxL=7	prefix[5]-prefix[3]=20-13=7	7+7=14
6	prefix[4]-prefix[3]=15-13=2 → maxL=max(7,2)=7	prefix[6]-prefix[4]=21-15=6	7+6=13
7	prefix[5]-prefix[4]=20-15=5 → maxL=7	prefix[7]-prefix[5]=30-20=10	7+10=17
8	prefix[6]-prefix[5]=21-20=1 → maxL=7	prefix[8]-prefix[6]=34-21=13	7+13=20 ✅
 */