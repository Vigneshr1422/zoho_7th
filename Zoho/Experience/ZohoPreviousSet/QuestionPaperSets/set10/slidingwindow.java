package set10;

import java.util.ArrayList;

public class slidingwindow {
    public static void main(String[] args) {
        int []arr={3,4,5,8,9,5,2,6,4};
        int k=3;

        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<=arr.length-k;i++){
            int max=arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j]>max){
                    max=arr[i+j];
                }
            }
            ans.add(max);
        }
        System.out.println(ans);
    }
}
