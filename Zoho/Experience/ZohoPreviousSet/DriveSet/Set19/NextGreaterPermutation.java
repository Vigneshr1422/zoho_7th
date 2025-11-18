package Zoho.Experience.ZohoPreviousSet.DriveSet.Set19;
import java.util.*;
/*
Example 1

Input: 2 1 8 7 6 5

👉 Goal — find the next greater permutation (அடுத்த பெரிய arrangement).

Step 1:

From right side paathu, first time decreasing pair varum place ah find pannanum.

8 > 7, 7 > 6, 6 > 5 → all decreasing

but 1 < 8 → idhu namma break point (pivot).
So pivot = index 1 (value 1).

Step 2:

Pivot oda right-side la iruka elements la, 1-a vida next greater smallest element choose pannum.
Right side = [8,7,6,5]
Next greater smallest = 5

Step 3:

Swap pivot (1) ↔ 5
Array → [2, 5, 8, 7, 6, 1]

Step 4:

Pivot-ku right side la iruka part reverse pannum
After index 1 → [8,7,6,1] → reverse → [1,6,7,8]

✅ Final Answer → [2, 5, 1, 6, 7, 8]
 */
public class NextGreaterPermutation {
    public static void main(String[] args) {
        int []arr={2, 1, 8, 7, 6, 5};

        NextGreaterPermutationFunction(arr);
    }
    public static void NextGreaterPermutationFunction(int []arr)
    {
        // first small element from last find pannanu
        int n=arr.length;

        int i=n-2;

        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0)
        {
            int j=n-1;

            while(arr[j]<=arr[i]){
                j--;
            }

            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int []arr, int i,int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    public static void reverse(int []arr, int i,int j)
    {
        while(i<j) {
           swap(arr,i,j);
            i++;
            j--;
        }
    }
}
