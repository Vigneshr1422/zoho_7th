package Zoho.Pdf110;
import java.util.*;
public class No_31_RemoveDigitIteratively {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int []arr={123,456,789};
    StringBuilder ans=new StringBuilder();

    for(int n:arr)
    {
        ans.append(n);
    }
        System.out.println(ans);

    while(true)
    {
        System.out.println("Enter a digit");
        int n=in.nextInt();
        char tar=(char) (n+'0');
        for(int i=0;i<ans.length();i++)
        {
            if(tar==ans.charAt(i))
            {
                ans.deleteCharAt(i);
                i--;
            }
        }
        if(ans.isEmpty()) break;
        System.out.println("After removing " + n + " → " + ans);

    }
        System.out.println("Finish");

    }
}
