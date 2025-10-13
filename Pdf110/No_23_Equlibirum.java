package Pdf110;

public class No_23_Equlibirum {
    public static void main(String[] args) {
        int []arr={1,2,3,7,6};
        int totalsum=0;
        for(int i:arr)
        {
            totalsum+=i;
        }
        int n=arr.length;
        int leftSum=0;
        for(int i=0;i<n;i++)
        {
          int rightSum=totalsum-leftSum-arr[i];
          if(rightSum==leftSum)
          {
              System.out.println(i);
              System.out.println(arr[i]);
              return;
          }
          leftSum+=arr[i];
        }
        System.out.println("no");


    }
}
