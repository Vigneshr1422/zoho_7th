package Zoho.Experience.Zoho_Images.ImageSet1;
/*
✅ Equal Stack Problem

Problem Statement:

You have three stacks of positive integers representing cylinder heights.

Each stack is represented as an array, where the top of the stack is the first element of the array.

You can remove cylinders only from the top of a stack.

Your task is to find the maximum possible height such that all three stacks have the same total height after removing zero or more cylinders from the top of each stack.

If it's not possible to equalize the stacks, return 0.

Input

Three integer arrays:

int[] s1 = {3, 2, 1, 1, 1};
int[] s2 = {4, 3, 2};
int[] s3 = {1, 1, 4, 1};


s1, s2, s3 represent the heights of cylinders in each stack.

1 <= s1.length, s2.length, s3.length <= 10^5

1 <= height of each cylinder <= 100

Output

An integer representing the maximum possible equal height of the three stacks.

Example 1

Input:

s1 = {3, 2, 1, 1, 1}
s2 = {4, 3, 2}
s3 = {1, 1, 4, 1}


Output:

5


Explanation:

Stack 1 total height: 3+2+1+1+1 = 8 → remove top 3 → remaining sum = 5

Stack 2 total height: 4+3+2 = 9 → remove top 4 → remaining sum = 5

Stack 3 total height: 1+1+4+1 = 7 → remove top 1+1 → remaining sum = 5

All stacks now have height 5 → maximum possible equal height = 5

Example 2

Input:

s1 = {1, 1, 1, 1}
s2 = {2, 2}
s3 = {1, 1, 2}


Output:

2


Explanation:

Remove top cylinders to make all stacks equal → maximum possible equal height = 2

Constraints & Notes

You can only remove cylinders from the top of a stack.

Stacks may have different initial heights.

The solution must be efficient, ideally O(n1+n2+n3).
 */
import java.util.*;
public class EqualStack {
    public static void main(String[] args) {
           int[] s1 = {3, 2, 1, 1, 1};
        int[] s2 = {4, 3, 2};
        int[] s3 = {1, 1, 4, 1};

        System.out.println(EqualStackFunction(s1,s2,s3));
    }

    public static int EqualStackFunction(int arr1[],int []arr2,int []arr3)
    {
       int sum1=0;
       int sum2=0;
       int sum3=0;

       for(int x:arr1)  sum1+=x;
       for(int x:arr2)  sum2+=x;
       for(int x:arr3)  sum3+=x;

       int  i=0,j=0,k=0;

       while(true){
           if(i==arr1.length || j==arr2.length || k==arr3.length){
               return  0;
           }
           if(sum1==sum2 && sum2==sum3){
               return  sum1;
           }
           if(sum1>=sum2 && sum1>=sum3){
               sum1-=arr1[i++];
           }else if(sum2>=sum1 && sum2>=sum3){
               sum2-=arr2[j++];
           }else {
               sum3-=arr3[k++];
           }
       }



    }

}
