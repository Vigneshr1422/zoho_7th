package Problem_Solving.search;

public class search {
    public static void main(String[] args) {
        int[] arr = {20, 15, 68, 2, 12};
        int n = arr.length;
        int tar = 442;
        boolean ans = binarysearch(arr, n, tar);
        if (ans) {
            System.out.println("found");

        } else {
            System.out.println("not found");
        }

        boolean an = Linearsearch(arr,n,tar);
        if (an) {
            System.out.println("found");

        } else {
            System.out.println("not found");
        }

    }
    public static boolean Linearsearch(int []arr, int n, int tar)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==tar){
                return true;
            }
        }
        return false;

    }
    public static boolean binarysearch(int []arr,int n,int tar) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == tar) {
                return true;
            } else if (arr[mid] < tar) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
