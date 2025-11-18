import java.util.Arrays;
/*
 * with comparator -> 0(nlog n) || manual sort 0(n2)
 *                         space -> 0(n)
 */
public class sumofweight{
    public static void main(String[] args) {
        int []arr={10,36,54,89,12};
        int [][]ans=new int[arr.length][2];

        for(int i=0;i<arr.length;i++)
        {
           
                ans[i][0]=arr[i];
                ans[i][1]=function(arr[i]);
        }

for (int i = 0; i < ans.length - 1; i++) {
    for (int j = i + 1; j < ans.length; j++) {
        if (ans[i][1] > ans[j][1]) {  // weight compare
            int temp0 = ans[i][0]; 
            ans[i][0] = ans[j][0];
            ans[j][0] = temp0;

            int temp1 = ans[i][1];
            ans[i][1] = ans[j][1];
            ans[j][1] = temp1;
        }
    }
}

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("<" +ans[i][0] + "," +ans[i][1]+">");
        }

    }
    public static int function(int x)
    {
        int sum=0;
        if(perfect(x))
        {
            sum+=5;
        }
        if(x%4==0 && x%6==0)
        {
            sum+=4;
        }
        if(x%2==0){
            sum+=3;
        }
        return sum;
    }

    public static boolean perfect(int k)
    {
       for(int i=1;i*i<=k;i++){
        if(i*i==k)
        {
            return true;
        }
       }
       return false;
    }
}

/*
 ithu optimal aa?
import java.util.Arrays;

public class sumofweight{
    public static void main(String[] args) {
        int []arr={10,36,54,89,12};
        int [][]ans=new int[arr.length][2];

        for(int i=0;i<arr.length;i++)
        {
           
                ans[i][0]=arr[i];
                ans[i][1]=function(arr[i]);
        }

        Arrays.sort(ans,(a,b)->Integer.compare(a[1], b[1]));

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("<" +ans[i][0] + "," +ans[i][1]+">");
        }

    }
    public static int function(int x)
    {
        int sum=0;
        if(perfect(x))
        {
            sum+=5;
        }
        if(x%4==0 && x%6==0)
        {
            sum+=4;
        }
        if(x%2==0){
            sum+=3;
        }
        return sum;
    }

    public static boolean perfect(int k)
    {
        int n=(int)Math.sqrt(k);
        return n*n==k;
    }
}

 */