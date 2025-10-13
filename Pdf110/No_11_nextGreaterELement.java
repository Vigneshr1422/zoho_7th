package Pdf110;
import java.util.*;
public class No_11_nextGreaterELement {
    public static void main(String[] args) {
        int []arr={6,3,9,10,8,2,1,15,7};
        int []res=NGE(arr);
        System.out.println(Arrays.toString(res));
    }
    public static void NGE_InPlace(int []arr) {
        Stack<Integer> stack = new Stack<>();
        // Traverse from right to left
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            int next = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
            arr[i] = next; // store NGE directly in arr
        }
    }


    public static int[] NGE(int []arr)
    {
        Stack<Integer>a=new Stack<>();
        int []res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!a.isEmpty() && a.peek()<=arr[i])
            {
                a.pop();
            }
            res[i]=a.isEmpty()?-1 : a.peek();

            a.push(arr[i]);
        }
        return res;
    }
}
