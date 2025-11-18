package Zoho.Experience.Zoho_Images.ImageSet1;

public class NumberIncresing_ {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {        // row
            int num = i;
            for (int j = 1; j <= i; j++) {    // column in row
                System.out.print(num + " ");
                num += n - j;                  // jump to next diagonal number
            }
            System.out.println();
        }
    }
}
