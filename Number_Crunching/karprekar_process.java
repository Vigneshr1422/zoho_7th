package Number_Crunching;

import java.util.Arrays;

public class karprekar_process {
    public static void main(String[] args) {
        int a = 3524;
        fun(a);
    }

    public static void fun(int a)
    {
        String b = String.valueOf(a);
        char[] arr = b.toCharArray();
        Arrays.sort(arr);
        int valA = Integer.parseInt(new String(arr));

        StringBuilder x = new StringBuilder(new String(arr));
        x.reverse();
        int valB = Integer.parseInt(x.toString());
        System.out.println(Arrays.toString(arr));
        System.out.println("Ascending "+ valA);
        System.out.println("Descending "+valB);

        int ans = valB - valA;
        if(ans==6174)
        {
            System.out.println("This is karpreker");
            return;
        }
        if(ans==0)
        {
            System.out.println("no da");
            return;
        }
        fun(ans);
    }

}