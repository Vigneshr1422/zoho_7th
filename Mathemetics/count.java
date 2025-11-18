package Mathemetics;

public class count {
    public static void main(String[] args) {
        int n=14456;
        // int count=0;
        // while(n!=0)
        // {
        //     n=n/10;
        //     count++;
        // }
        // System.out.println(count);

        int count;
        if(n==0)
        {
            count=1;
        }
        else
        {
            n=Math.abs(n);
            count=(int)(Math.log10(n)+1);
        }

        System.out.println(count);
    }
}
