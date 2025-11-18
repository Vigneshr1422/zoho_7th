package Problem_Solving.Recursion.Arrays;

public class linear_Search {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 89};
        int tar = 8;
        if (cheak(arr, tar,0)) {
            System.out.println("it present ");
        }else
        {
            System.out.println("Not");
        }
        System.out.println(checkIndex(arr,tar,0));

    }
    public static boolean cheak(int []arr,int tar,int i)
    {
        if(i==arr.length)
            return false ;

        return arr[i]==tar || cheak(arr,tar,i+1);
    }

    static int checkIndex(int []arr, int tar, int i)
    {
        if(i==arr.length)
        {
            return -1;
        }else if(arr[i]==tar)
        {
            return i;
        }
        return checkIndex(arr,tar,i+1);
    }
}
