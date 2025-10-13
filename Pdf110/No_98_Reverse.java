package Pdf110;

public class No_98_Reverse {
    public static void main(String[] args) {
        String a="A man, in the boat says : I see 1-2-3 in the sky";
        ReverseCharacaterOnly(a);
        }
    public static void ReverseCharacaterOnly(String a)
    {
        int left=0;
        int right=a.length()-1;

        char []arr=a.toCharArray();

        while(left<right)
        {
            if(!Character.isLetterOrDigit(arr[left]))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(arr[right])){
                right--;
            }
            else
            {
                char x=arr[left];
                arr[left]=arr[right];
                arr[right]=x;
                left++;
                right--;
            }
        }
        System.out.println(new String(arr));
    }
}
