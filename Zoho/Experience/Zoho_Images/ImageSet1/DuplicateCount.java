package Zoho.Experience.Zoho_Images.ImageSet1;
import java.util.*;
public class DuplicateCount {
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3,1,2,4,4,4,4,4,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        int c=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]==arr[i]){
                c++;
            }else{
                if(c>1){
                    System.out.println(arr[i-1] +"  -> "+c);
                }
                c=1;
            }
        }
        if(c>1){
            System.out.println(arr[n-1]+" "+c);
        }
    }
}
