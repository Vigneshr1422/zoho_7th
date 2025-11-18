package Zoho.GitHub_pradeep;

public class No_77_BinaryPattern {
    public static void main(String[] args) {
        int n = 3;
        printBinaryPattern(n);
    }

    static void printBinaryPattern(int n) {
        int total = (int) Math.pow(2, n); // total combinations
        for (int i = 0; i < total; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(((i >> j) & 1) + " ");
            }
            System.out.println();
        }
    }
}
