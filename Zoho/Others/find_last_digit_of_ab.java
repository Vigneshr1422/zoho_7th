package Zoho.Others;

public class find_last_digit_of_ab {
    public static void main(String[] args) {
        String a="26";
        String b="3";

        System.out.println(fun(a,b));
    }
    public static int fun(String a,String b)
    {
        if(a.equals("0"))
            return  0;

        // cyclic order
        int [][]order={
                {0},
                {1},
                {2,4,8,6},
                {3,9,7,1},
                {4,6},
                {5},
                {6},
                {7,4,3,1},
                {8,4,2,6},
                {9,1}
        };

        int x=a.charAt(a.length()-1)-'0';

        int []arr=order[x];
        int l=arr.length;

        int rem=0;
        for(int i=0;i<b.length();i++)
        {
            rem=(rem*10+(b.charAt(i)-'0'))%l;
        }

        if(rem==0)
            rem=l;

        return arr[rem-1];

    }
}
