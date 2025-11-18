package Zoho.Others;

public class m_To_N_condition {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        for (int i = a; i < b; i++) {
            if (reverse(i))
                System.out.println(i);
        }
    }

    public static boolean reverse(int n) {
        if (n == 0) {
            return false;
        }

        int store = n;

        int x = 0;
        int temp = n;

        // Sum of digits
        while (temp != 0) {
            int rem = temp % 10;
            x += rem;
            temp /= 10;
        }

        // Reverse the sum
        int y = 0;
        int sum = x;
        while (sum != 0) {
            int rem = sum % 10;
            y = y * 10 + rem;
            sum /= 10;
        }

        return x * y == store;
    }
}
