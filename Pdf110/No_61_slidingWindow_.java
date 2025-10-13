package Pdf110;
import java.util.*;
public class No_61_slidingWindow_ {

        public static void main(String[] args) {
            int[] arr = {4, 0, -1, 3, 5, 3, 6, 8};
            int k = 3;
            System.out.println(maxInWindow(arr, k));
        }

        static List<Integer> maxInWindow(int[] arr, int k) {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i <= arr.length - k; i++) {
                int max = arr[i];
                for (int j = i; j < i + k; j++) {
                    max = Math.max(max, arr[j]);
                }
                res.add(max);
            }
            return res;
        }
       public static List<Integer> maxWindow(int[] arr, int k) {
            List<Integer> result = new ArrayList<>();
            Deque<Integer> dq = new ArrayDeque<>(); // store indexes

            for (int i = 0; i < arr.length; i++) {

                // 1️⃣ Remove out-of-window index
                while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                    dq.pollFirst();

                // 2️⃣ Remove smaller elements (they can’t be max)
                while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                    dq.pollLast();

                // 3️⃣ Add current index
                dq.offerLast(i);

                // 4️⃣ Add current max (from deque front)
                if (i >= k - 1)
                    result.add(arr[dq.peekFirst()]);
            }
            return result;
        }



}
