package Patters;

public class NumberPramid {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            for(int s=i;s<n;s++){
                System.out.print("--");
            }

            // desending number

            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }

            // asending number -->
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
}
