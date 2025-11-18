package Zoho.GitHub_pradeep;
import java.util.*;
public class No_35_MatrixAdditionOptimized {
   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // number of arrays
            sc.nextLine();

            List<Integer> result = new ArrayList<>();
            result.add(0); // initial sum = 0

            for (int i = 0; i < n; i++) {
                String[] arr = sc.nextLine().trim().split(" ");
                List<Integer> num = new ArrayList<>();
                for (String s : arr) {
                    for (char c : s.toCharArray()) {
                        num.add(c - '0');
                    }
                }
                result = add(result, num);
            }

            // Print result directly (MSB first)
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
            }
        }

        // Add two numbers represented as List<Integer> (digits, MSB first)
        static List<Integer> add(List<Integer> a, List<Integer> b) {
            List<Integer> res = new ArrayList<>();
            int i = a.size() - 1;
            int j = b.size() - 1;
            int carry = 0;

            while (i >= 0 || j >= 0 || carry != 0) {
                int sum = carry;
                if (i >= 0) sum += a.get(i--);
                if (j >= 0) sum += b.get(j--);
                res.add(sum % 10); // add LSB first
                carry = sum / 10;
            }

            // The result is built in reverse, reverse once at the end
            Collections.reverse(res);
            return res;
        }
    }
