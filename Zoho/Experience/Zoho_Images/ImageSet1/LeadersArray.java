package Zoho.Experience.Zoho_Images.ImageSet1;

public class LeadersArray {
    public static void main(String[] args) {
        int []arr={16,17,4,3,5,2};
        int n=arr.length;

        int val=arr[n-1];
        String answer= val+" ";

        for(int i=n-2;i>=0;i--)
        {
            if(val<arr[i]){
                val=arr[i];
                answer=val+" "+answer;
            }
        }

        System.out.println(answer);
    }
}
