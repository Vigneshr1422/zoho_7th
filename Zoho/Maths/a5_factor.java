package Maths;
import java.util.*;
public class a5_factor {
    public static void main(String[] args) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=25;
        int c=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
                ans.add(i);

                if(n/i!=i){
                    c++;
                    ans.add(n/i);
                }
            }
        }
        System.out.println(ans);
        System.out.println(c);
    }
    
}
