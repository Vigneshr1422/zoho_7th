package Zoho.Others;
//day 2
public class House_Robber {
    public static void main(String[] args) {

        int[] arr = {7, 77, 3, 1, 4, 2, 1, 8};

        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        ans[1]=Math.max(arr[0],arr[1]);

        for(int i=2;i<arr.length;i++)
        {
            ans[i]=Math.max(ans[i-2]+arr[i],ans[i-1]);
        }
        System.out.println(ans[ans.length-1]);
    }
}