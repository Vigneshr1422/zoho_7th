package Zoho.Others;
//28
public class Equlibrium {
    public static void main(String[] args) {
        int arr[]={-7,1,6,2,-4,3,0};

        int total=0;

        for(int i:arr)
        {
            total+=i;
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++)
        {
            int rightsum=total-leftsum-arr[i];

            if(leftsum==rightsum)
            {
                System.out.println(i);
                return;
            }
            leftsum+=arr[i];
        }
        System.out.println(-1);
    }
}
