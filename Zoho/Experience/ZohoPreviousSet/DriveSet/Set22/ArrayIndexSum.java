package Zoho.Experience.ZohoPreviousSet.DriveSet.Set22;

public class ArrayIndexSum {
    public static void main(String[] args) {
        int []arr1={106,12,13,16};
        int []arr2={1,3,124,5,6,12};
        int []arr3={1,2,3,51,6};
        int []arr4={111,222,203,5201,6};

        int tar1=6;

        int tar2=2;

        int tar3=1;

        int tar4=2;

        System.out.println(Function(arr3,tar3));
    }
    public static int Function(int []arr,int tar){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i];
            while(n!=0)
            {
                int r=n%10;
                if(r==tar) {
                    sum+=i;
                    break;
                }
                n/=10;
            }
        }
return  sum;
    }
}
