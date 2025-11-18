package Zoho.Others;

public class palindrome_Make {
    public static void main(String[] args) {
       String str="abca";
        System.out.println(palimake(str));

    }
    public static boolean palimake(String str) {

        int n=str.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                char []arr=str.toCharArray();
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                if(pali(new String(arr))){
                    System.out.println("Swapping position like "+i+" and "+j +" make pali "+new String(arr));
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean pali(String a)
    {
        int left=0;
        int right=a.length()-1;
        while(left<right)
        {
            if(a.charAt(left)!=a.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }
}
