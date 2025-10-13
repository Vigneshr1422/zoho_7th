package GitHub_pradeep;

import java.util.Scanner;
import java.util.Arrays;

public class No_37_EvaluateSortExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of input:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] expressions = new String[n];
        long[] values = new long[n];

        for (int i = 0; i < n; i++) {
            expressions[i] = sc.nextLine();
            values[i] = evaluate(expressions[i]);
        }

        // Sort using bubble sort (or any simple method)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    long tempVal = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tempVal;

                    String tempStr = expressions[j];
                    expressions[j] = expressions[j + 1];
                    expressions[j + 1] = tempStr;
                }
            }
        }

        for (String expr : expressions) {
            System.out.println(expr);
        }
    }

    // Evaluate a simple expression (supports *, ^, integers)
    static long evaluate(String s) {
        s = s.trim();
        if (s.contains("*")) {
            String[] parts = s.split("\\*");
            return Long.parseLong(parts[0]) * Long.parseLong(parts[1]);
        } else if (s.contains("^")) {
            String[] parts = s.split("\\^");
            // handle right-associative a^b^c
            long res = Long.parseLong(parts[parts.length - 1]);
            for (int i = parts.length - 2; i >= 0; i--) {
                res = (long) Math.pow(Long.parseLong(parts[i]), res);
            }
            return res;
        } else {
            return Long.parseLong(s);
        }
    }
}
