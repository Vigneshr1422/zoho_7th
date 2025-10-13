package GitHub_pradeep;
import java.util.*;
public class No_50_NGE {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 10, 8, 2, 1, 15, 7};
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if (!st.isEmpty()) res[i] = st.peek();
            st.push(arr[i]);
        }

        System.out.println("Next Greater Elements:");
        for (int x : res)
            System.out.print((x == -1 ? "_" : x) + " ");
    }
}

