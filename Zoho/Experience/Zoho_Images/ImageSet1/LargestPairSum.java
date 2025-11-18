package Zoho.Experience.Zoho_Images.ImageSet1;

public class LargestPairSum {
    public static void main(String[] args) {
        int []arr={0,5,6,0,1,0,1,7};
        int sum=arr[0]+arr[1];

        for(int i=1;i<arr.length-1;i++)
        {
            int cur=arr[i-1]+arr[i];
            if(sum<cur){
                sum=cur;
            }
        }
        System.out.println(sum);
    }
}
