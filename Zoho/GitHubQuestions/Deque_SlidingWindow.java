package GitHubQuestions;
/*
 🔹 Example (Your code input)
arr = {4, 0, -1, 3, 5, 3, 6, 8}
k = 3

🔹 Step-by-step Sliding Window Maximum

Window size = 3

[4,0,-1] → max = 4

[0,-1,3] → max = 3

[-1,3,5] → max = 5

[3,5,3] → max = 5

[5,3,6] → max = 6

[3,6,8] → max = 8

🔹 Output (Answer)
[4, 3, 5, 5, 6, 8]
 */
import java.util.*;

public class Deque_SlidingWindow {
    public static void main(String[] args) {
        int []arr={4,0,-1,3,5,3,6,8};
        ArrayList<Integer>ans=windowFunction(arr,3);
        System.out.println(ans);

    }

    public static ArrayList<Integer> windowFunction(int arr[],int k)
    {
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();

        int idx=0;

        Deque<Integer>queue=new ArrayDeque<>();

        for(int i=0;i<n;i++)
        {
            if(!queue.isEmpty()&& queue.peek()==i-k){
                queue.poll();
            }

            while(!queue.isEmpty() && arr[queue.peekLast()]<arr[i]){
                queue.pollLast();
            }

            queue.offer(i);

            if(i>=k-1){
                ans.add(arr[queue.peek()]);
            }
        }

        return ans;
    }
}
