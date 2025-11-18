package set6;
import java.util.*;
public class possibleWord {
    public static void main(String[] args) {
        String n="11112";
        List<String> result=new ArrayList<>();
        decode(n,0,"",result);
        System.out.println(result);
    }
    public static void decode(String n,int index, String res, List<String>ans){

        if(index==n.length()){
            ans.add(res);
            return;
        }

        int num=n.charAt(index)-'0';
        if(num>=1 && num<=9){
            decode(n, index+1, res+(char)('A'+num-1), ans);
        }

        if(index+1<n.length()){
            int num2=Integer.parseInt(n.substring(index, index+2));
            if(num2>=10 && num2<=26){
                decode(n, index+2, res+(char)('A'+num2-1), ans);
            }
        }
    }
}
