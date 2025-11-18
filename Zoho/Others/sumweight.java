package Zoho.Others;
// day 3
// Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the
//following conditions
//1. 5 if a perfect square
//2. 4 if multiple of 4 and divisible by 6
//3. 3 if even number
//And sort the numbers based on the weight and print it as follows
//<10,its_weight>,<36,its weight><89, its weight>
//Should display the numbers based on increasing order.

public class sumweight {
    public static void main(String[] args) {
        int []arr={10,36,54,89,12};

        int[][]ans=new int[arr.length][2];

        for(int i=0;i<arr.length;i++)
        {
            ans[i][0]=arr[i];
            ans[i][1]=function(arr[i]);
        }


        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("After sorting");

        // bubble sort

        for(int i=0;i<ans.length-1;i++)
        {
            for(int j=0;j<ans.length-i-1;j++)
            {
                if(ans[j][1]>ans[j+1][1])
                {
                    int []temp=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp;
                }
            }
        }

        //print

        for(int i=0;i<ans.length;i++)
        {
            System.out.print("<"+ans[i][0]+","+ans[i][1]+">");
//            if(i!=ans.length-1)
//            {
//                System.out.print(",");
//            }
        }

    }

    public static int function(int n)
    {
        // is Perfect Square
        int sum=0;

        if(isPerfect(n))
        {
            sum+=5;
        }
        if(n%4==0  && n%6==0)
        {
           sum+=4;
        }
        if(n%2==0)
        {
            sum+=3;
        }
        return sum;


    }

    static boolean isPerfect(int n)
    {
        int x=(int)Math.sqrt(n);
        return x*x==n;
    }
}
