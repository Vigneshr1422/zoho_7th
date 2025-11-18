package Zoho.Experience.Zoho_Images.ImageSet1;
/*
✅ Boat Greedy – FULL Question

Question:
A boat can carry at most 2 people at a time, and the sum of their weights must not exceed the limit.
Given an array of people’s weights and a weight limit, find the minimum number of boats needed to rescue everyone.

📥 Sample Input 1
arr = [1, 2]
limit = 3

📤 Output
1

👉 Explanation

1 + 2 = 3 ≤ limit → both go in the same boat → 1 boat

📥 Sample Input 2
arr = [3, 2, 2, 1]
limit = 3

📤 Output
3

👉 Explanation

Sorted: [1, 2, 2, 3]

1 + 3 > 3 → 3 goes alone → boat1

1 + 2 ≤ 3 → boat2

Remaining 2 → boat3

Total boats = 3

📥 Sample Input 3
arr = [3, 5, 3, 4]
limit = 5

📤 Output
4

👉 Explanation

Sorted: [3, 3, 4, 5]

3 + 5 > 5 → boat1

3 + 4 > 5 → boat2

4 (remaining) → boat3

3 (remaining) → boat4

Total = 4 boats

📥 Sample Input 4
arr = [2, 2, 2, 2]
limit = 3

📤 Output
4

👉 Explanation

2 + 2 = 4 > 3 → no two can sit together
So each person needs their own boat → 4 boats
 */
import java.util.*;
public class BoatGreedy {
    public static void main(String[] args) {
        int []arr={1,2};
        int limit=3;
        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;
        int ans=0;

        while(start<=end){
            if(arr[start]+arr[end]<=limit){
                start++;
            }
            ans++;
            end--;
        }
        System.out.println(ans);
    }
}
