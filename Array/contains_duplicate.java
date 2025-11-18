package Array;

import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at
least twice in the array, and return false if every element is
distinct.
Input: nums = [1,2,3,1]
Output: true 

 */
public class contains_duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};

        boolean ans=function(arr);
        System.out.println("Answer is "+ans);

    }
    public static boolean function(int []arr)
    {
            HashSet<Integer>a=new HashSet<>();

            for(int k:arr)
            {
                if(a.contains(k))
                {
                    return true;
                }
                else
                {
                    a.add(k);
                }
            }
            return false;
    }
    
}
