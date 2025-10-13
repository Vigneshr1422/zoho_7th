package BitManipulation;

public class DecimalConvert {
    public static void main(String[] args) {
        String a = "1101";
        System.out.println(DeciConvert(a));


    }
    public static int DeciConvert(String a){
        int n=a.length()-1;
        int ans=0;
        int pow=1;

        for(int i=n;i>=0;i--)
        {
            if(a.charAt(i)=='1'){
               ans=ans+pow;
            }
            pow*=2;

        }
return ans;
    }
}
