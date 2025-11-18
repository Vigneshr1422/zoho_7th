package Zoho.Pdf110;


public class No_30_Largest {
    public static void main(String[] args) {
        String []arr={"54","546","60","548"};
        LargestFunction(arr);
    }
    public static void LargestFunction(String []arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                String xy=arr[j]+arr[j+1];
                String yx=arr[j+1]+arr[j];


                if(compareTofunction(xy,yx)<0)
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        for(String s:arr)
        {
            ans.append(s);
        }
        System.out.println(ans);
    }

    public static int compareTofunction(String a, String b)
    {
        int n=a.length();
        int m=b.length();


        int x=Math.min(m,n);

        for(int i=0;i<x;i++)
        {
            char c1=a.charAt(i);
            char c2=b.charAt(i);

            if(c1!=c2)
            {
                return c1-c2;
            }

        }
        return n-m;
    }
}
