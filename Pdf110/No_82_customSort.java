package Pdf110;

import java.util.Arrays;

public class No_82_customSort {
    public static void main(String[] args) {
        int[] arr = {100, 11, 1, 21, 2, 5, 4};

        System.out.println(CustomSortBasedOnDigit(arr));

    }

    public static String CustomSortBasedOnDigit(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(arr[j], arr[j + 1]) > 0) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static int compare(int a, int b)
    {
        String x=String.valueOf(a);
        String y=String.valueOf(b);

        int len=Math.min(x.length(),y.length());

        for(int i=0;i<len;i++)
        {
            if(x.charAt(i)!=y.charAt(i)) return x.charAt(i)-y.charAt(i);
        }
        return x.length()-y.length();
    }
}
