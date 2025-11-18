package Level3;
import java.util.*;
public class subarray_fav_window_problem {
    public static void main(String[] args) {
        int []arr={35,145,67,1004,88,456,2034};
        int ws=3;
        int fav=8;

        List<String>valid=new ArrayList<>();
        List<String>invalid=new ArrayList<>();


        for(int i=0;i<=arr.length-ws;i++)
        {
            int []ans=Arrays.copyOfRange(arr,i,i+ws);
            String mazxi=maxDigitofArr(ans);

            boolean favcount=false;

            for(int x:ans)
            {
                if(String.valueOf(x).contains(String.valueOf(fav))){
                    favcount=true;
                    break;
                }
            }

            System.out.println(Arrays.toString(ans)+" -> "+mazxi);
            if(favcount){
                valid.add(Arrays.toString(ans));
            }else
            {
                invalid.add(Arrays.toString(ans));
            }


        }
        System.out.println("Valid "+valid);
        System.out.println("Invalid "+invalid);


    }

    public static String maxDigitofArr(int[]arr)
    {
        StringBuilder ans=new StringBuilder();
        int maxDigitLen=0;

        for(int i:arr)
        {
            maxDigitLen=Math.max(maxDigitLen,String.valueOf(i).length());
        }

        for(int i=0;i<maxDigitLen;i++) {
            int maxDigit = 0;

            for(int k:arr)
            {
                String a=String.valueOf(k);
                int index=a.length()-1-i;

                if(index>=0)
                {
                    int digit=a.charAt(index)-'0';
                    maxDigit=Math.max(maxDigit,digit);
                }
            }

            ans.append(maxDigit);

        }

        return ans.reverse().toString();
    }
}
