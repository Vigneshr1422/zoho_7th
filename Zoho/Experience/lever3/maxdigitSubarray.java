package lever3;
import java.util.*;
public class maxdigitSubarray {
    public static void main(String[] args) {
        int []arr={35,145,67,1004,88,456,2034};
        int fav=8;
        int ws=3;
        
        List<String>valid=new ArrayList<>();
        List<String>invalid=new ArrayList<>();

        for(int i=0;i<=arr.length-ws;i++)
        {
            int ans[]=Arrays.copyOfRange(arr, i, i+ws);
            String derived=function(ans);

            boolean favs=false;

            
            for(int x:ans)
            {
                if(String.valueOf(x).contains(String.valueOf(fav))){
                    favs=true;
                    break;
                }
            }

            System.out.println(Arrays.toString(ans)+"->>>>>>" +derived);

            if(favs){
                valid.add(Arrays.toString(ans));
            }else
            {
                invalid.add(Arrays.toString(ans));
            }

        }

        System.out.println("Valid "+valid);
        System.out.println("Invalid"+invalid);

       
    }

     public static String function(int []arr)
        {
            int maxdigitlen=0;

            for(int x:arr)
            {
                maxdigitlen=Math.max(maxdigitlen, String.valueOf(x).length());
            }

            StringBuilder ans=new StringBuilder();
            for(int i=0;i<maxdigitlen;i++)
            {
                int maxDigit=0;

                for(int n:arr)
                {
                    String st=String.valueOf(n);

                    int idx=st.length()-1-i;

                    if(idx>=0)
                    {
                        int digit=st.charAt(idx)-'0';
                        maxDigit=Math.max(maxDigit,digit);
                    }
                }
                ans.append(maxDigit);
            }

            return ans.reverse().toString();
            
        }
}
