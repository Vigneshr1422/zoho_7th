package Problem_Solving.String;

public class longest_odd_String {
    public static void main(String[] args) {
        int ans=Integer.MIN_VALUE;
        String a="5204182";
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<=a.length();j++) {
                String store =a.substring(i,j);
                int num=Integer.parseInt(store);
                if(num%2!=0)
                {
                    ans=Math.max(num,ans);
                }
            }
        }
        System.out.println(ans);


           }
}
