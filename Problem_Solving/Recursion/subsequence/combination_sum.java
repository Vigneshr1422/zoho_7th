package Problem_Solving.Recursion.subsequence;
import java.util.*;
public class combination_sum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int t = 7;

        List<List<Integer>> ans = fun(arr, t);
        for(List<Integer>ak: ans)
        {
            for(int k:ak)
            {
                System.out.println(k);
            }
        }

    }

    public static List<List<Integer>> fun(int[] arr, int t) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(0, arr, t, ans, new ArrayList<>());
        return ans;

    }

    public static void helper(int idx, int[] arr, int t, List<List<Integer>> ans, List<Integer> x) {
        if (idx == arr.length) {
            if (t == 0) {
                ans.add(new ArrayList < > (x));
            }
            return;
        }
            if (arr[idx] <= t) {
                x.add(arr[idx]);
                helper(idx, arr, t - arr[idx], ans, x);
                x.remove(x.size()-1);
            }
            helper(idx + 1, arr, t, ans, x);
        }
    }

