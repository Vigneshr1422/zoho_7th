package Zoho.Pdf110;

public class No_112_firstOccurence {
    public static void main(String[] args) {
        String a="test123String";
        String b="123";
        int ans=a.indexOf(b);
        System.out.println(ans);
        functionIndexOf();
    }

    public static void functionIndexOf()
    {
        String a="test123String";
        String b="123";
        int n=a.length();
        int m=b.length();
        for(int i=0;i<=n-m;i++)
        {
            int j=0;
          while(j<m && a.charAt(i+j)==b.charAt(j))
          {
              j++;
          }
          if(j==m)
          {
              System.out.println(i);
              return;
          }
        }
        System.out.println("No ");
    }
}
