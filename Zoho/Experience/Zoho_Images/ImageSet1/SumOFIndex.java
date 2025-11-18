package Zoho.Experience.Zoho_Images.ImageSet1;

public class SumOFIndex {
    public static void main(String[] args) {
        int []arr={106,12,13,16};
        int d=6;

        System.out.println(function(arr,d));
    }
    public static int function(int []arr,int n)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            while(x!=0) {
                if (x % 10 == n) {
                    sum += i;
                    break;
                }
                x/=10;
            }
        }
        return sum;
    }
}

