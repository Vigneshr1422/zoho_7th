package Zoho.Pdf110;

public class No_93_MonoDigitConverter {
    public static void main(String[] args) {
        solve("72581");  // Output: 777
        solve("3962");   // Output: cannot create a mono digit number
    }

    public static void solve(String input) {
        int[] digits = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            digits[i] = input.charAt(i) - '0';
        }

        for (int target = 0; target <= 9; target++) {
            int finalLen = canReduce(digits, target);
            if (finalLen > 0) {
                System.out.println(String.valueOf(target).repeat(finalLen));
                return;
            }
        }
        System.out.println("cannot create a mono digit number");
    }

    // return final length if reducible, else 0
    public static int canReduce(int[] original, int target) {
        int[] arr = original.clone();
        int len = arr.length;

        while (true) {
            boolean merged = false;
            for (int i = 0; i < len - 1; i++) {
                int a = arr[i], b = arr[i + 1];
                if (a == target && b == target) continue;

                if (a + b == target || a - b == target) {
                    arr[i] = target;
                    for (int j = i + 1; j < len - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    len--;
                    merged = true;
                    break;
                }
            }
            if (!merged) break;
        }

        for (int i = 0; i < len; i++) {
            if (arr[i] != target) return 0;
        }
        return len;
    }
}


