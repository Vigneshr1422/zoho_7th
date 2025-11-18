package GitHubQuestions;

public class a8_a1_monodigit {
    public static void main(String[] args) {
        solve("72581");  // Output: 777
        solve("3962");   // Output: cannot create a mono digit number
    }

    public static void solve(String input) {
        int digit[] = new int[input.length()];
        int n = input.length();

        for (int i = 0; i < n; i++) {
            digit[i] = input.charAt(i) - '0';
        }

        boolean possible = false;

        for (int i = 0; i <= 9; i++) {
            int len = reduce_fun(digit, i);
            if (len > 0) {
                char ch = (char)(i + '0');  // convert int digit to char

               StringBuilder sb = new StringBuilder();
            for (int k = 0; k < len; k++) {
             sb.append(ch);
            }
System.out.println(sb.toString());

                possible = true;
                break;  // stop once found
            }
        }

        if (!possible) {
            System.out.println("cannot create a mono digit number");
        }
    }

    public static int reduce_fun(int[] a, int tar) {
        int arr[] = a.clone();
        int n = arr.length;

        while (true) {
            boolean check = false;

            for (int i = 0; i < n - 1; i++) {
                int d1 = arr[i];
                int d2 = arr[i + 1];

                // if (d1 == tar && d2 == tar) continue;

                if (d1 + d2 == tar || d1 - d2 == tar) {
                    arr[i] = tar;

                    for (int j = i + 1; j < n - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    n -= 1;
                    check = true;
                    break;
                }
            }
            if (!check) break;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != tar) return 0;
        }
        return n;
    }
}
