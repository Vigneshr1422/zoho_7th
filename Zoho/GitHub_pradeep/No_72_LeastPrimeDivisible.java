package Zoho.GitHub_pradeep;
public class No_72_LeastPrimeDivisible {

    public static void main(String[] args) {
        int[] arr1 = {20, 7};
        int[] arr2 = {11, 5};
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = findPrime(arr1[i], arr2[i]);
        }

        System.out.print("Output: [ ");
        for (int x : result) System.out.print(x + " ");
        System.out.println("]");
    }

    // function to find least prime under 1000 satisfying (a + prime) % b == 0
    static int findPrime(int a, int b) {
        for (int p = 1; p <= 1000; p++) {  // 1 considered prime
            if (isPrime(p) && (a + p) % b == 0)
                return p;
        }
        return -1; // if no prime works
    }

    // normal prime check
    static boolean isPrime(int n) {
        if (n == 1) return true; // special rule as per problem
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
