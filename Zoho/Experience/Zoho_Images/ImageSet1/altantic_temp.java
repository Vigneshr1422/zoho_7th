package Zoho.Experience.Zoho_Images.ImageSet1;
/*
✅ FULL QUESTION (Perfect match for your code)

Question:
You are given an array representing the daily Atlantic Ocean temperature readings.
You must find the length of the longest continuously decreasing temperature streak.

A decreasing streak means:

arr[i] < arr[i – 1]


The streak must have at least 3 days to be counted.
You need to return the maximum length among all such streaks.

If no decreasing streak of length ≥ 3 exists, return 0.

📌 Example

Input:

[19, 9, 18, 7, 6, 8]


Decreasing streaks:

19 → 9 (length 2) ❌ (less than 3)

18 → 7 → 6 (length 3) ✔ valid

So the output is:

3

✅ Given Input
int[] arr = {19, 9, 18, 7, 6, 8};

❓ What the code does

It finds the longest decreasing subsequence streak (continuous) of length ≥ 3.

A "streak" means arr[i] < arr[i-1] continuously.

🔍 Step-by-step tracing
Array:

19, 9, 18, 7, 6, 8

Check each consecutive pair:
i	Pair	Decreasing?	Streak Count
1	9 < 19	✔ Yes	2
2	18 < 9	❌ No	reset to 1
3	7 < 18	✔ Yes	2
4	6 < 7	✔ Yes	3 ✅ (≥3)
5	8 < 6	❌ No	reset

📌 The only valid decreasing streak of length ≥3 is:

18 → 7 → 6

Length = 3

✅ Final Output
3
 */
public class altantic_temp {
    public static void main(String[] args) {
        int[] arr = {19, 9, 18, 7, 6, 8};
        int max = 0;
        int count = 1; // start streak with first element
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            if (arr[i] < arr[i - 1]) {
                count++; // continue streak
            }
            else {
                if (count >= 3) max = Math.max(max, count);
                count = 1; // reset streak
            }
        }

        // check last streak
        if (count >= 3)
            max = Math.max(max, count);

        System.out.println(max);
    }
}
/*
✅ Input 1
int[] arr = {30, 20, 10, 5};


Decreasing fully → 30 → 20 → 10 → 5
Length = 4

Output:

4

✅ Input 2
int[] arr = {5, 4, 3, 10, 9};


Decreasing streaks:

5 → 4 → 3 → length 3

10 → 9 → length 2

Longest = 3

Output:

3

✅ Input 3
int[] arr = {100, 60, 20, 30, 25, 10};


Streaks:

100 → 60 → 20 → length 3

30 → 25 → 10 → length 3

Longest = 3

Output:

3

✅ Input 4
int[] arr = {8, 7, 6, 5, 4, 20, 15, 10};


Streak 1 → 8 → 7 → 6 → 5 → 4 → length 5
Streak 2 → 20 → 15 → 10 → length 3

Longest = 5

Output:

5

✅ Input 5 (Very simple)
int[] arr = {10, 9, 8};


All decreasing → length = 3

Output:

3
 */