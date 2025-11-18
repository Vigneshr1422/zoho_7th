package leetcode_review;

public class missingnumber {
    public static void main(String[] args) {
        int arr[]={1,2,4};

        int n=arr.length+1;
        int xor=0;

        for(int i=1;i<=n;i++){
            xor^=i;
        }

        for(int i:arr)
        {
            xor^=i;
        }
        System.out.println(xor);

    }    
}
