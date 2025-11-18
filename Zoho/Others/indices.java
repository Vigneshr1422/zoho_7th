package Zoho.Others;

public class indices {
    public static void main(String[] args) {
        String s="codeleet";
        int []arr={4,5,6,7,0,2,1,3};
        char []ans=new char[arr.length];
        for(int i=0;i<s.length();i++)
        {
            ans[arr[i]]=(s.charAt(i));
        }
        System.out.println(new String (ans));
    }
}
