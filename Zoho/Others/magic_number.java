package Zoho.Others;

public class magic_number {
    public static void main(String[] args) {
        long n = 250000;
        for (int i = 1; i <= n; i++) {
            if(magic(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static  boolean magic(int n)
    {
        int cube=n*n*n;
        return cheak(n,cube);
    }

    public static boolean cheak(int n, long cube) {
        int[] numArr = new int[10];
        int[] cubArr = new int[10];
        n = Math.abs(n);
        cube=Math.abs(cube);
        while (n != 0) {
            numArr[n % 10]++;
            n /= 10;
        }
        while (cube != 0) {
            cubArr[(int)cube % 10]++;
            cube /= 10;
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != cubArr[i]) {
                return false;
            }
        }
        return true;
    }
}
