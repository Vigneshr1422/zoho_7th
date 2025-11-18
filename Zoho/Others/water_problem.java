package Zoho.Others;
//day 2
public class water_problem {
    public static void main(String[] args) {
        int []arr={1,6,2,5,4,7,3,7};
        int start=0;
        int end=arr.length-1;
        int ans=0;

        while(start<=end)
        {
            int area=Math.min(arr[start],arr[end])*(end-start);

            ans=Math.max(area,ans);

            if(arr[start]<arr[end])
            {
                start++;
            }else
            {
                end--;
            }
        }
        System.out.println("Answer is "+ans);
    }
}
