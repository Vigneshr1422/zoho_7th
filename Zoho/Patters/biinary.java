package Zoho.Patters;

public class biinary {
 public static void main(String[] args) {
    int n=3;
    int total=1<<n; 
    for(int i=0;i<total;i++){

        for(int j=n-1;j>=0;j--){
            int val=(i>>j) &1;
            System.out.print(val+" ");
        }
        System.out.println();
    }
 }   
}
