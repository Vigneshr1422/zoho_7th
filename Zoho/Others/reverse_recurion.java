package Zoho.Others;

public class reverse_recurion {
    public static void main(String[] args) {
        String input ="Dragon s Mathemetics.power ";
        System.out.println(reverse(input));
    }
    public static String reverse(String str)
    {
        if(!contains(str) || str.isEmpty())
        {
            return str;
        }
        int index=indexof(str);
        String first=substring(str,0,index);
        String last=substring(str,index+1,str.length());
        return reverse(last)+" "+first;
    }
    public static boolean contains(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                return true;
        }
        return false;
    }
    public static int indexof(String str)
    {
        for(int i=0;i<str.length();i++)

        {
            if(str.charAt(i)==' ')
            {
                return i;
            }
        }
        return -1;
    }
    public static String substring(String s,int f,int l)
    {
        StringBuilder ans=new StringBuilder();
        for( int i=f;i<l;i++)
        {
            ans.append(s.charAt(i));

        }
        return ans.toString();
    }
}
