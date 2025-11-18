package leetcode_review;

public class stock_buy_sell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};

        int min=Integer.MAX_VALUE;
        int max=0;

        for(int c:arr)
        {
            if(c<min)
            {
                min=c;
            }else
            {
                max=Math.max(max, c-min);
            }
        }

        System.out.println(max);
    

    }
}
