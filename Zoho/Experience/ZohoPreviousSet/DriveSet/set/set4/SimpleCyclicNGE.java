package folders.set.set4;

public class SimpleCyclicNGE {
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 6, 9, 5};
        int n = arr.length;
        int[] next = new int[n];

        // Initialize all as -1
        for (int i = 0; i < n; i++) next[i] = -1;

        int[] stack = new int[n];  // simple manual stack
        int top = -1;

        // Traverse twice
        for (int i = 0; i < 2 * n; i++) {
            int curr = arr[i % n];

            while (top >= 0 && arr[stack[top]] < curr) {
                next[stack[top--]] = curr;
            }

            if (i < n) stack[++top] = i;
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + (next[i] == -1 ? "" : next[i]));
        }
    }
}
