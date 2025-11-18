package Zoho.Experience.Zoho_Images.ImageSet1;
import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println(longestConsecutive(nums1)); // 4
        System.out.println(longestConsecutive(nums2)); // 9
    }
    public static int longestConsecutive(int []arr)
    {
        Arrays.sort(arr);
        int c=1;
        int max=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1]) {
                continue;
            }
            else if(arr[i-1]+1==arr[i]){
                c++;
            }else {
                max = Math.max(max, c);
                c = 1;
            }
        }
        max = Math.max(max, c);

        return max;
    }
}
