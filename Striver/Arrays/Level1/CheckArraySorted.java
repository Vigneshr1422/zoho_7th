package Striver.Arrays.Level1;
public class CheckArraySorted {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        function(arr);
    }
    public static  void function(int []arr){
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[i%n]){
                c++;
            }
        }
        System.out.println(c<=1 ? "True" : "False");
    }
}
