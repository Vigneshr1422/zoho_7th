package GitHub_pradeep;
import java.util.*;

public class No_112_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 1, even = 2;

        for (int i = 1; i <= n; i++) {
            // leading spaces (4 spaces for each missing row)
            for (int sp = 0; sp < n - i; sp++) {
                System.out.print("   ");
            }

            // print numbers
            for (int j = 1; j <= i; j++) {
                int val = (i % 2 == 1) ? odd : even;
                System.out.printf("%2d ", val);

                if (i % 2 == 1)
                    odd += 2;
                else
                    even += 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
