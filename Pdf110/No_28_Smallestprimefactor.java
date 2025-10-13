package Pdf110;

import java.util.Arrays;

public class No_28_Smallestprimefactor {
    public static void main(String[] args) {
        int []arr={10,15,7,12};
        Function(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int Smallestfactor(int n)
    {
     for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
               return i;
            }
        }
        return n;
    }

        public static void Function(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Smallestfactor(arr[j]) > Smallestfactor(arr[j + 1])) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

}
