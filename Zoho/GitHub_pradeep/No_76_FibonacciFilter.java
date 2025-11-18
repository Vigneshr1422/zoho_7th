package Zoho.GitHub_pradeep;

public class No_76_FibonacciFilter {
    public static void main(String[] args) {
        int[] arr = {2, 10, 4, 8};
        printFibonacciNumbers(arr);
    }

    static void printFibonacciNumbers(int[] arr) {
        System.out.print("Output: ");
        for (int n : arr) {
            if (isFibo(n))
                System.out.print(n + " ");
        }
    }

    // check if a number is Fibonacci
    static boolean isFibo(int n) {
        int a = 0, b = 1, c = 0;
        if (n == 0 || n == 1) return true;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
            if (c == n) return true;
        }
        return false;
    }
}

