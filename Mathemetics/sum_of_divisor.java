package Mathemetics;

// import java.util.*;

public class sum_of_divisor {
    public static void main(String[] args) {
        int n=18;
        // ArrayList<Integer>ans=new ArrayList<>();

        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                // ans.add(i);
                if(i!= n/i)
                {
                    // ans.add(n/i);
                }
            }

        }
        // Collections.sort(ans);
        // System.out.println(ans);

       
    }
}
