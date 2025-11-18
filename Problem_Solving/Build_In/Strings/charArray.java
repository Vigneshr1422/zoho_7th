package Problem_Solving.Build_In.Strings;
import java.util.*;
public class charArray {
    public static void main(String[] args) {
        String a="Hi";
        char[]arr=new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            arr[i]=a.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
