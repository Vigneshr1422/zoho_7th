package set4.levelone;

import java.util.*;

public class factor_sort {
    public static void main(String[] args) {
        int []arr={8,2,3,12,16};

        function(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void function(int []arr){

        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                if(factorcount(arr[i])<factorcount(arr[j]))
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }

            }
        }
    }

    public static int factorcount(int n){

        int ans=0;

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                    if(i*i==n){
                        ans++;
                    }else{
                        ans+=2;
                    }
            }
        }
        return ans;
    }
}
