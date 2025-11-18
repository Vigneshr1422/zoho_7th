package Number_Crunching;

public class perfect {
    public static void main(String[] args) {
        int a=1;
        int b=2500;
        for(int i=a;i<b;i++)
        {
            if(perfect(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean perfect(int a)
    {
        int sum=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }

        boolean ans=sum==a ? true:false;
        //System.out.println(ans);
        return ans;
    }
}
