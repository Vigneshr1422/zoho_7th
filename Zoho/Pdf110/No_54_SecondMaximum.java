package Zoho.Pdf110;

public class No_54_SecondMaximum {
    public static void main(String[] args) {
        int []arr={1,5,8,9,6,7,5,6,};

        int max=Integer.MIN_VALUE;
        int sMax=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                sMax=max;
                max=arr[i];
            }
            else if(arr[i]!=max && sMax<arr[i]){
                sMax=arr[i];
            }
        }
        System.out.println(sMax);
    }
}
