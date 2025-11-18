package Zoho.GitHub_pradeep;
public class No_65_PrimeFactorSort {
    // Function to find smallest prime factor
    static int smallestPrimeFactor(int n) {
        if (n <= 1) return n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return i; // first divisor is the smallest prime factor
        }
        return n; // number itself is prime
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 21, 14, 33, 22};
        int n = arr.length;

        // Manual bubble sort based on smallest prime factor
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int sf1 = smallestPrimeFactor(arr[j]);
                int sf2 = smallestPrimeFactor(arr[j + 1]);

                // if smaller prime factor is greater, swap
                if (sf1 > sf2 || (sf1 == sf2 && arr[j] > arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted by smallest prime factor: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
