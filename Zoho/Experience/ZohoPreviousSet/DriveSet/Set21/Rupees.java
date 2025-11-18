package Zoho.Experience.ZohoPreviousSet.DriveSet.Set21;

public class Rupees {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        int c=1;
        int total=5;

        System.out.println("Count ways "+FunctionCount(a,b,c,total));
    }

    public static int FunctionCount(int one,int two,int five,int total)
    {
        int count=0;

        for(int i=0;i<five;i++)
        {
            for(int j=0;j<two;j++)
            {
                int remain=total-(2*j+5*i);
                if(remain>=0 && remain<=one){
                    count++;
                }
            }
        }
        return count;
    }
}
/*
📘 Example
A = 3, B = 2, C = 1, T = 5


Possible combinations:

1-rupee	2-rupee	5-rupee	Total
3	1	0	5
1	2	0	5
0	0	1	5

✅ So, total 3 ways
 */