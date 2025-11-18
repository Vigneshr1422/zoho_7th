package set13;

public class greater_previous {
    public static void main(String[] args) {
        int arr[]={2,-3,-4,5,9,8,7,11};

        int prev=arr[0];
        System.out.print(prev+" ");

        for(int i=1;i<arr.length;i++){
            if(arr[i]>prev){
                System.out.print(arr[i]+" ");
            }
            prev=arr[i];
        }
    }
}
