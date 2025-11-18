package KunalKushwaha.BinarySearch.Level2;

public class SquareRoot {
    public static void main(String[] args) {
        int n=16;
        System.out.println(sqrtFunction(n));
    }
    public static int sqrtFunction(int n)
    {
        int start=1;
        int end=n/2;
        int ans=-1;

        while (start<end)
        {
            long mid=start+(end-start)/2;
            if(mid*mid<=n){
                ans=(int)mid;
                start=(int)mid+1;
            }
            else {
                end=(int)mid-1;
            }
        }
        return ans;
    }
}
