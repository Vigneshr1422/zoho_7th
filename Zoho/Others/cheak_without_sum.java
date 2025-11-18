package Zoho.Others;
/*
Input: a = 105, b = 106, op = '+'

Step 1: 105 + 106 = 211
Step 2: Remove 0s → 105 → 15, 106 → 16
Step 3: 15 + 16 = 31
Step 4: Remove 0s from original result (211) → still 211

Compare 31 and 211 → ❌ Not same → Output: NO
 */
public class cheak_without_sum {
    public static void main(String[] args) {
        int a=105;
        int b=106;
        int res=a+b;

        int res_withoutZero=fun(res);
        int a_z=fun(a);
        int b_z=fun(b);
        if(res_withoutZero==a_z+b_z)
            System.out.println("True");
        else {
            System.out.println("False");
        }
    }

    public static int fun(int n)

    {
        int sum=0;
        int t=1;

        while(n!=0)
        {
            int rem=n%10;
            if(rem!=0)
            {
                sum+=rem*t;
                t*=10;

            }
            n/=10;
        }

        return sum;
    }
}
