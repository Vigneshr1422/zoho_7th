package Patterns;

public class a3 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            int start = num;

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start += 2;
            }

            // Prepare num for next row
            if (i % 2 == 1) {
                num += 1;
            } else {
                num += i;
            }

            System.out.println();
        }
    }
}
