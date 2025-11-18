package Problem_Solving.SubArray;

public class kadans {
    public static void main(String[] args) {
        int []arr={1, 4, 20, 3, 10, 5};
        int ans=arr[0];
        int current=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            current=Math.max(arr[i],current+arr[i]);
            ans=Math.max(ans,current);
        }
        System.out.println(ans);
    }
}
