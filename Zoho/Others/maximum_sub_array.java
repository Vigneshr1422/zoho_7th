package Zoho.Others;

public class maximum_sub_array {
    public static void main(String[] args) {
        int []arr={-2,-5,6,-2,-3,1,5,-6};
        int ans=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(arr[i],arr[i]+max);
            ans=Math.max(ans,max);
        }
        System.out.println(ans);
    }
}
