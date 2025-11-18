package Zoho.Pdf110;

public class No_94_greater {
    public static void main(String[] args) {
        int[] arr = {2, -3, -4, 5, 9, 7, 8};

        int maxSoFar = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > maxSoFar) {
                System.out.print(x + " ");
                maxSoFar = x;
            }
        }
    }
}
