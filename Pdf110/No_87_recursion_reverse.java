package Pdf110;

public class No_87_recursion_reverse {
    public static void main(String[] args) {
        String a="one two three";
        System.out.println(RecursiveFunction(a));
    }
    public static String RecursiveFunction(String a)
    {
        if(a.isEmpty()) return "";
        int n=LastIndex(a);
        if(n==-1) return a;
        String first =SubStringFunction(a,n+1,a.length());
        String last=SubStringFunction(a,0,n);
        return first+" "+RecursiveFunction(last);
    }
    public static int LastIndex(String a)
    {
        if(a.isEmpty()) return 0;
        for(int i=a.length()-1;i>=0;i--)
        {
            if(a.charAt(i)==' ') return  i;
        }
        return -1;
    }
    public static String SubStringFunction(String a,int s, int e)
    {
        String ans ="";
        for(int i=s;i<e;i++)
        {
            ans=ans+a.charAt(i);
        }
        return ans;
    }
}
