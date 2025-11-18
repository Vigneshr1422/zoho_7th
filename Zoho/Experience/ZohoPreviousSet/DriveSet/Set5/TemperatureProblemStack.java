package Zoho.Experience.ZohoPreviousSet.DriveSet.Set5;
import java.util.*;
public class TemperatureProblemStack {
    public static void main(String[] args) {
        int []arr={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(function(arr)));
    }
    public static int[] function(int []arr)
    {
        int []ans=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                int p=st.pop();
                ans[p]=i-p;
            }
            st.push(i);
        }
        return ans;
    }
}
